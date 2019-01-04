package uk.gov.defra.tracesx.tradetariff.exceptions;

import com.github.fge.jsonpatch.JsonPatchException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.everit.json.schema.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger EXCEPTION_LOGGER = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

  @ExceptionHandler(value = {NotImplementedException.class})
  protected ResponseEntity<java.lang.Object> handleMethodNotImplemented(Exception ex, WebRequest request) {
    EXCEPTION_LOGGER.info("Method Not Implemented");
    return handleExceptionInternal(ex, "", new HttpHeaders(), HttpStatus.NOT_IMPLEMENTED, request);
  }

  @ExceptionHandler(value = {NotFoundException.class, NoSuchElementException.class})
  protected ResponseEntity<Object> handleNotFound(Exception ex, WebRequest request) {
    EXCEPTION_LOGGER.info("{} : {}", PAGE_NOT_FOUND_LOG_CATEGORY, request.getDescription(false));
    return handleExceptionInternal(ex, "", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
  }

  @ExceptionHandler(value = {JsonPatchException.class, IOException.class})
  protected ResponseEntity<Object> handleBadJson(Exception ex, WebRequest request) {
    EXCEPTION_LOGGER.info("Invalid Json");
    return handleExceptionInternal(ex, "", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
  }

  @ExceptionHandler(value = {ValidationException.class})
  protected ResponseEntity<Object> handleInvalidSchema(Exception ex, WebRequest request) {
    EXCEPTION_LOGGER.info("Schema validation failed");
    return handleExceptionInternal(
        ex,
        getSchemaErrors((ValidationException) ex),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST,
        request);
  }

  private String getSchemaErrors(ValidationException e) {
    String errorsOutput;
    if (e.getCausingExceptions().size() > 0) {
      String errors =
          e.getCausingExceptions()
              .stream()
              .map(i -> (i.getPointerToViolation() + " : " + i.getErrorMessage()))
              .collect(Collectors.joining(System.lineSeparator()));

      errorsOutput = String.format("Schema error with model: %s", errors);
    } else {
      errorsOutput =
          String.format(
              "Schema or model error: %s : %s", e.getErrorMessage(), e.getPointerToViolation());
    }
    return errorsOutput;
  }
}
