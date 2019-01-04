package uk.gov.defra.tracesx.tradetariff.dao.entities.section;

import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionChapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SectionChapterTest {

  private static final String DESCRIPTION = "LIVE ANIMALS";
  private static final String GOODS_NOMENCLATURE_ITEM_ID ="0100000000";
  private static final int GOODS_NOMENCLATURE_SID = 27809;
  private static final String HEADINGS_FROM = "4";
  private static final String HEADINGS_TO = "18";
  private static final String FORMATTED_DESCRIPTION = "Live animals";
  private static final int CHAPTER_NOTE_ID = 47;

  public SectionChapterTest() {
  }
    
  @Before
  public void setUp() {
  }
    
  @After
  public void tearDown() {
  }

  @Test
  public void verifyDescriptionProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, chapter.getDescription());
  }

  @Test
  public void verifyGoods_nomenclature_item_idProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, chapter.getGoods_nomenclature_item_id());    
  }
  
  @Test
  public void verifyGoods_nomenclature_sidProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_SID, chapter.getGoods_nomenclature_sid());
  }

  @Test
  public void verifyHeadings_fromProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setHeadings_from(HEADINGS_FROM);

    //Then
    assertEquals(HEADINGS_FROM, chapter.getHeadings_from());
  }

  @Test
  public void verifyHeadings_toProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setHeadings_to(HEADINGS_TO);

    //Then
    assertEquals(HEADINGS_TO, chapter.getHeadings_to());
  }

  @Test
  public void verifyFormatted_descriptionProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, chapter.getFormatted_description());
  }

  @Test
  public void verifyChapter_note_idProperty() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    
    //When
    chapter.setChapter_note_id(CHAPTER_NOTE_ID);

    //Then
    assertEquals(CHAPTER_NOTE_ID, chapter.getChapter_note_id());
  }

  @Test
  public void verifyToString() {
    //Given
    SectionChapter chapter  = new SectionChapter();
    String expResult = "SectionChapter{"
            + "description=" + DESCRIPTION
            + ", goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID
            + ", goods_nomenclature_sid=" + GOODS_NOMENCLATURE_SID
            + ", headings_from=" + HEADINGS_FROM
            + ", headings_to=" + HEADINGS_TO
            + ", formatted_description=" + FORMATTED_DESCRIPTION
            + ", chapter_note_id=" + CHAPTER_NOTE_ID + '}';
    
    //when
    chapter.setDescription(DESCRIPTION);
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    chapter.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);
    chapter.setHeadings_from(HEADINGS_FROM);
    chapter.setHeadings_to(HEADINGS_TO);
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);
    chapter.setChapter_note_id(CHAPTER_NOTE_ID);

    //Then
    assertEquals(expResult, chapter.toString());
  }
    
}
