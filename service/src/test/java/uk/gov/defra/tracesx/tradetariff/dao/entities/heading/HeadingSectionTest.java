package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingSection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeadingSectionTest {
  
  private static final int POSITION = new Double(Math.random()).intValue();
  private static final String TITLE = "A fancy title!";
  private static final String NUMERAL = "IV";
  private static final String SECTION_NOTE = "A section note";
      
  public HeadingSectionTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void verifySectionPositionProperty() {
    //Given
    HeadingSection section = new HeadingSection();
    
    //When
    section.setPosition(POSITION);

    //Then
    assertEquals(POSITION, section.getPosition());    
  }
  
  @Test
  public void verifySectionTitleProperty() {
    //Given
    HeadingSection section = new HeadingSection();
    
    //When
    section.setTitle(TITLE);

    //Then
    assertEquals(TITLE, section.getTitle());
  }

  @Test
  public void verifySectionNumeralProperty() {
    //Given
    HeadingSection section = new HeadingSection();
    
    //When
    section.setNumeral(NUMERAL);

    //Then
    assertEquals(NUMERAL, section.getNumeral());
  }

  @Test
  public void verifySectionSection_noteProperty() {
    //Given
    HeadingSection section = new HeadingSection();
    
    //When
    section.setSection_note(SECTION_NOTE);

    //Then
    assertEquals(SECTION_NOTE, section.getSection_note());
  }
  
  @Test
  public void verifySectionToString() {
    //Given
    HeadingSection section = new HeadingSection();
    String expResult = "HeadingSection{position=" + POSITION + 
            ", title=" + TITLE + 
            ", numeral=" + NUMERAL + 
            ", section_note=" + SECTION_NOTE + '}';
            
    //When
    section.setPosition(POSITION);
    section.setTitle(TITLE);
    section.setNumeral(NUMERAL);
    section.setSection_note(SECTION_NOTE);

    //Then
    assertEquals(expResult, section.toString());
  }
  
}
