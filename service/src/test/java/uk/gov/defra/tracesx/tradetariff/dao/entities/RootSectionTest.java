package uk.gov.defra.tracesx.tradetariff.dao.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class RootSectionTest {
    
  private static final int ID = new Double(Math.random()).intValue();
  private static final int POSITION = new Double(Math.random()).intValue();
  private static final String TITLE = "A fancy title!";
  private static final String NUMERAL = "IV";
  private static final String CHAPTER_FROM = "4";
  private static final String CHAPTER_TO = "18";
  private static final int SECTION_NOTE_ID = new Double(Math.random()).intValue();
    
  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }
  
    @Test
  public void verifyIdProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setId(ID);

    //Then
    assertEquals(ID, rootSection.getId());
  }
  
  @Test
  public void verifyPositionProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setPosition(POSITION);

    //Then
    assertEquals(POSITION, rootSection.getPosition());    
  }
  
  @Test
  public void verifyTitleProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setTitle(TITLE);

    //Then
    assertEquals(TITLE, rootSection.getTitle());
  }

  @Test
  public void verifyNumeralProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setNumeral(NUMERAL);

    //Then
    assertEquals(NUMERAL, rootSection.getNumeral());
  }

  @Test
  public void verifyChapter_fromProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setChapter_from(CHAPTER_FROM);

    //Then
    assertEquals(CHAPTER_FROM, rootSection.getChapter_from());
  }

  @Test
  public void verifyChapter_toProperty() {
    //Given
    RootSection rootSection = new RootSection();
    
    //When
    rootSection.setChapter_to(CHAPTER_TO);

    //Then
    assertEquals(CHAPTER_TO, rootSection.getChapter_to());
  }

  @Test
  public void verifySection_note_idProperty() {
    //Given
    RootSection rootSection = new RootSection();
        
    //When
    rootSection.setSection_note_id(SECTION_NOTE_ID);

    //Then
    assertEquals(SECTION_NOTE_ID, rootSection.getSection_note_id());
  }

  @Test
  public void verifyToString() {
    //Given
    RootSection rootSection = new RootSection();
    
  //Given
    String expResult = "RootSection{" + 
            "id=" + ID + 
            ", position=" + POSITION + 
            ", title=" + TITLE + 
            ", numeral=" + NUMERAL + 
            ", chapter_from=" + CHAPTER_FROM + 
            ", chapter_to=" + CHAPTER_TO + 
            ", section_note_id=" + SECTION_NOTE_ID + '}';
            
    //When
    rootSection.setId(ID);
    rootSection.setPosition(POSITION);
    rootSection.setTitle(TITLE);
    rootSection.setNumeral(NUMERAL);
    rootSection.setChapter_from(CHAPTER_FROM);
    rootSection.setChapter_to(CHAPTER_TO);
    rootSection.setSection_note_id(SECTION_NOTE_ID);

    //Then
    assertEquals(expResult, rootSection.toString());
  }
}
