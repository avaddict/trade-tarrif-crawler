package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.CommodityChapter;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CommodityChapterTest {
  
  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0200000000";
  private static final String DESCRIPTION = "MEAT AND EDIBLE MEAT OFFAL";
  private static final String FORMATTED_DESCRIPTION = "Meat and edible meat offal";
  private static final String NOTE = "* 1\\.This chapter does not cover:";

  public CommodityChapterTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }


  @Test
  public void verifyChapterGoods_nomenclature_item_idProperty() {
    //Given
    CommodityChapter chapter = new CommodityChapter();

    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, chapter.getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyChapterDescriptionProperty() {
    //Given
    CommodityChapter chapter = new CommodityChapter();

    //When
    chapter.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, chapter.getDescription());
  }

  @Test
  public void verifyChapterFormatted_descriptionProperty() {
    //Given
    CommodityChapter chapter = new CommodityChapter();

    //When
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, chapter.getFormatted_description());
  }

  @Test
  public void verifyChapterNoteProperty() {
    //Given
    CommodityChapter chapter = new CommodityChapter();

    //When
    chapter.setChapter_note(NOTE);

    //Then
    assertEquals(NOTE, chapter.getChapter_note());
  }

  @Test
  public void verifyChapterToString() {
    //Given
    CommodityChapter chapter = new CommodityChapter();
    String expResult = "CommodityChapter{goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID
            + ", description=" + DESCRIPTION
            + ", formatted_description=" + FORMATTED_DESCRIPTION
            + ", chapter_note=" + NOTE + '}';

    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    chapter.setDescription(DESCRIPTION);
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);
    chapter.setChapter_note(NOTE);

    //Then
    assertEquals(expResult, chapter.toString());
  }

}
