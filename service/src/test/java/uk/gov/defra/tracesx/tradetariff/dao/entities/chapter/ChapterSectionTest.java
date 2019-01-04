package uk.gov.defra.tracesx.tradetariff.dao.entities.chapter;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ChapterSectionTest {

  private static final int SECTION_ID = 1;
  private static final String SECTION_TITLE = "Live animals; animal products";
  private static final int SECTION_POSITION = 1;
  private static final String SECTION_NUMERAL = "I";
  private static final String SECTION_SECTION_NOTE = "\"* 1\\\\. Any reference in this section";

  public ChapterSectionTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void verifySectionIdProperty() {
    //Given
    ChapterSection section = new ChapterSection();

    //When
    section.setId(SECTION_ID);

    //Then
    assertEquals(SECTION_ID, section.getId());
  }

  @Test
  public void verifySectionTitleProperty() {
    //Given
    ChapterSection section = new ChapterSection();

    //When
    section.setTitle(SECTION_TITLE);

    //Then
    assertEquals(SECTION_TITLE, section.getTitle());
  }

  @Test
  public void verifySectionPositionProperty() {
    //Given
    ChapterSection section = new ChapterSection();

    //When
    section.setPosition(SECTION_POSITION);

    //Then
    assertEquals(SECTION_POSITION, section.getPosition());
  }

  @Test
  public void verifySectionNumeralProperty() {
    //Given
    ChapterSection section = new ChapterSection();

    //When
    section.setNumeral(SECTION_NUMERAL);

    //Then
    assertEquals(SECTION_NUMERAL, section.getNumeral());
  }

  @Test
  public void verifySectionSection_noteProperty() {
    //Given
    ChapterSection section = new ChapterSection();

    //When
    section.setSection_note(SECTION_SECTION_NOTE);

    //Then
    assertEquals(SECTION_SECTION_NOTE, section.getSection_note());
  }

  @Test
  public void verifySectionToString() {
    //Given
    ChapterSection section = new ChapterSection();
    String expResult = "ChapterSection{" + "id=" + SECTION_ID
            + ", title=" + SECTION_TITLE
            + ", position=" + SECTION_POSITION
            + ", numeral=" + SECTION_NUMERAL
            + ", section_note=" + SECTION_SECTION_NOTE + '}';
    //When
    section.setId(SECTION_ID);
    section.setTitle(SECTION_TITLE);
    section.setPosition(SECTION_POSITION);
    section.setNumeral(SECTION_NUMERAL);
    section.setSection_note(SECTION_SECTION_NOTE);

    //Then
    assertEquals(expResult, section.toString());
  }
}
