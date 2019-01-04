package uk.gov.defra.tracesx.tradetariff.exceptions;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.Appender;
import java.util.ArrayList;
import java.util.List;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import static org.hamcrest.Matchers.is;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;


public class RestResponseEntityExceptionHandlerTest {
  
  @Mock
  private Appender mockAppender;
  
  @Captor
  private ArgumentCaptor<LoggingEvent> captorLoggingEvent;
  
  @Mock
  WebRequest mockWebRequest;
          
  @Before
  public void setUp() {
    initMocks(this);
    final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    logger.addAppender(mockAppender);
  }
  
  @After
  public void teardown() {
        final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.detachAppender(mockAppender);
    }

  @Test
  public void logsNotFoundException() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
    when(mockWebRequest.getDescription(false)).thenReturn("some description");
  
    //When
    exceptionHandler.handleNotFound(ex, mockWebRequest);
            
    //Then
    verify(mockAppender).doAppend(captorLoggingEvent.capture());
    final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
    assertThat(loggingEvent.getLevel(), is(Level.INFO));
    assertThat(loggingEvent.getFormattedMessage(),
            is("org.springframework.web.servlet.PageNotFound : some description")); 
  }
  
    @Test
  public void notFoundExceptionReturnsCorrectHttpResponse() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
    
    //When
    ResponseEntity<Object> response = exceptionHandler.handleNotFound(ex, mockWebRequest);
    
    //Then
    assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    assertEquals("", response.getBody());
  }
  
  @Test
  public void logsNotImplementedException() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
  
    //When
    exceptionHandler.handleMethodNotImplemented(ex, mockWebRequest);
            
    //Then
    verify(mockAppender).doAppend(captorLoggingEvent.capture());
    final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
    assertThat(loggingEvent.getLevel(), is(Level.INFO));
    assertThat(loggingEvent.getFormattedMessage(),
            is("Method Not Implemented")); 
  }
  

  @Test
  public void handleNotImplementedReturnsCorrectHttpResponse() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
    
    //When
    ResponseEntity<Object> response = exceptionHandler.handleMethodNotImplemented(ex, mockWebRequest);
    
    //Then
    assertEquals(HttpStatus.NOT_IMPLEMENTED, response.getStatusCode());
    assertEquals("", response.getBody());
  }
  
  @Test
  public void logsBadJson() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
  
    //When
    exceptionHandler.handleBadJson(ex, mockWebRequest);
            
    //Then
    verify(mockAppender).doAppend(captorLoggingEvent.capture());
    final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
    assertThat(loggingEvent.getLevel(), is(Level.INFO));
    assertThat(loggingEvent.getFormattedMessage(),
            is("Invalid Json")); 
  }
  
  @Test
  public void handleBadJsonReturnsCorrectHttpResponse() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    Exception ex = new Exception();
    
    //When
    ResponseEntity<Object> response = exceptionHandler.handleBadJson(ex, mockWebRequest);
    
    //Then
    assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    assertEquals("", response.getBody());
  }
  
  @Test
  public void logsNestedSchemaValidationFailure() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    ValidationException exception = mock(ValidationException.class);
    ValidationException exceptionNested = mock(ValidationException.class);
    when(exceptionNested.getPointerToViolation()).thenReturn("pointer");
    when(exceptionNested.getErrorMessage()).thenReturn("error message");
    List<ValidationException> nestedExceptions = new ArrayList();
    nestedExceptions.add(exceptionNested);
    when(exception.getCausingExceptions()).thenReturn(nestedExceptions);
  
    //When
    exceptionHandler.handleInvalidSchema(exception, mockWebRequest);
            
    //Then
    verify(mockAppender).doAppend(captorLoggingEvent.capture());
    final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
    assertThat(loggingEvent.getLevel(), is(Level.INFO));
    assertThat(loggingEvent.getFormattedMessage(),
            is("Schema validation failed")); 
  }
  
  @Test
  public void logsSchemaValidationFailure() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    ValidationException exception = mock(ValidationException.class);
    when(exception.getPointerToViolation()).thenReturn("pointer");
    when(exception.getErrorMessage()).thenReturn("error message");
    List<ValidationException> nestedExceptions = new ArrayList();
    when(exception.getCausingExceptions()).thenReturn(nestedExceptions);
  
    //When
    exceptionHandler.handleInvalidSchema(exception, mockWebRequest);
            
    //Then
    verify(mockAppender).doAppend(captorLoggingEvent.capture());
    final LoggingEvent loggingEvent = captorLoggingEvent.getValue();
    assertThat(loggingEvent.getLevel(), is(Level.INFO));
    assertThat(loggingEvent.getFormattedMessage(),
            is("Schema validation failed")); 
  }
  
  @Test
  public void handleInvalidSchemaCorrectHttpResponse() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    ValidationException exception = mock(ValidationException.class);
    
    //When
    ResponseEntity<Object> response = exceptionHandler.handleInvalidSchema(exception, mockWebRequest);
    
    //Then
    assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    assertEquals("Schema or model error: null : null", response.getBody());
  }
  
  @Test
  public void handleUnimplementedCorrectHttpResponse() {
    //Given
    RestResponseEntityExceptionHandler exceptionHandler = new RestResponseEntityExceptionHandler();
    ValidationException exception = mock(ValidationException.class);
    
    //When
    ResponseEntity<Object> response = exceptionHandler.handleInvalidSchema(exception, mockWebRequest);
    
    //Then
    assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    assertEquals("Schema or model error: null : null", response.getBody());
  }

}
