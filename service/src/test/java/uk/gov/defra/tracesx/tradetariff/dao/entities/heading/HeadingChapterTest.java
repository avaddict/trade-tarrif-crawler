package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingChapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeadingChapterTest {
    
  private static final String GOODS_NOMENCLATURE_ITEM_ID ="0100000000";
  private static final String DESCRIPTION = "LIVE ANIMALS";
  private static final String FORMATTED_DESCRIPTION = "Live animals";
  private static final String CHAPTER_NOTE = "* 1\\\\. This chapter covers all live animals except:";

    
  public HeadingChapterTest() {
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
    HeadingChapter chapter = new HeadingChapter();

    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, chapter.getGoods_nomenclature_item_id());
   }
    
   @Test
   public void verifyChapterDescriptionProperty() {
     //Given
     HeadingChapter chapter = new HeadingChapter();

     //When
     chapter.setDescription(DESCRIPTION);
     
    //Then
    assertEquals(DESCRIPTION, chapter.getDescription());
   }
    
   @Test
   public void verifyChapterFormatted_descriptionProperty() {
     //Given
     HeadingChapter chapter = new HeadingChapter();

     //When
     chapter.setFormatted_description(FORMATTED_DESCRIPTION);
     
    //Then
    assertEquals(FORMATTED_DESCRIPTION, chapter.getFormatted_description());
   }
    
   @Test
   public void verifyChapterNoteProperty() {
     //Given
     HeadingChapter chapter = new HeadingChapter();

     //When
     chapter.setChapter_note(CHAPTER_NOTE);
     
    //Then
    assertEquals(CHAPTER_NOTE, chapter.getChapter_note());
   }

  @Test
  public void verifyChapterToString() {
    //Given
    HeadingChapter chapter = new HeadingChapter();
    String expResult = "HeadingChapter{goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID + 
            ", description=" + DESCRIPTION +
            ", formatted_description=" + FORMATTED_DESCRIPTION +
            ", chapter_note=" + CHAPTER_NOTE + '}';
            
    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    chapter.setDescription(DESCRIPTION);
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);
    chapter.setChapter_note(CHAPTER_NOTE);

    //Then
    assertEquals(expResult, chapter.toString());
  }

}
