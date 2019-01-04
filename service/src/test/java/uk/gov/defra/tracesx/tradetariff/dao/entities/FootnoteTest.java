package uk.gov.defra.tracesx.tradetariff.dao.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FootnoteTest {
  
  public FootnoteTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  private static final String FOOTNOTE_CODE = "TN701";
  private static final String FOOTNOTE_DESCRIPTION = "A footnote description";
  private static final String FOOTNOTE_FORMATTED_DESCRIPTION = "A footnote formatted description";

  @Test
  public void verifyCodeProperty() {
    //Given
    Footnote footnote = new Footnote();
    
    //When
    footnote.setCode(FOOTNOTE_CODE);

    //Then
    assertEquals(FOOTNOTE_CODE, footnote.getCode());
  }

  @Test
  public void verifyDescriptionProperty() {
    //Given
    Footnote footnote = new Footnote();
    
    //When
    footnote.setDescription(FOOTNOTE_DESCRIPTION);

    //Then
    assertEquals(FOOTNOTE_DESCRIPTION, footnote.getDescription());
  }

  @Test
  public void verifyFormatted_descriptionProperty() {
    //Given
    Footnote footnote = new Footnote();
    
    //When
    footnote.setFormatted_description(FOOTNOTE_FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FOOTNOTE_FORMATTED_DESCRIPTION, footnote.getFormatted_description());
  }

  @Test
  public void verifyToString() {
    //Given
    Footnote footnote = new Footnote();
    String expResult = "Footnote{code=" + FOOTNOTE_CODE + 
            ", description=" + FOOTNOTE_DESCRIPTION +
            ", formatted_description=" + FOOTNOTE_FORMATTED_DESCRIPTION + '}';
            
    //When
    footnote.setCode(FOOTNOTE_CODE);
    footnote.setDescription(FOOTNOTE_DESCRIPTION);
    footnote.setFormatted_description(FOOTNOTE_FORMATTED_DESCRIPTION);

    //Then
    assertEquals(expResult, footnote.toString());
  }

}