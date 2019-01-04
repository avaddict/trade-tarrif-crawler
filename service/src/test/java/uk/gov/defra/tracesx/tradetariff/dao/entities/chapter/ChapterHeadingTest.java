package uk.gov.defra.tracesx.tradetariff.dao.entities.chapter;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ChapterHeadingTest {
  
  private static final int HEADING_GOODS_NOMENCLATURE_SID = 27810;
  private static final String HEADING_GOODS_NOMENCLATURE_ITEM_ID = "0201000000";
  private static final boolean HEADING_DECLARABLE = false;
  private static final String HEADING_DESCRIPTION = "Meat of bovine animals, fresh or chilled";
  private static final String HEADING_PRODUCLINE_SUFFIX = "80";
  private static final boolean HEADING_LEAF = true;
  private static final String HEADING_DESCRIPTION_PLAIN = "Meat of bovine animals, fresh or chilled - plain";
  private static final String HEADING_FORMATTED_DESCRIPTION = "Meat of bovine animals, fresh or chilled - formatted";

  public ChapterHeadingTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }


  @Test
  public void verifyHeadingGoods_nomenclature_sidProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID);

    //Then
    assertEquals(HEADING_GOODS_NOMENCLATURE_SID, heading.getGoods_nomenclature_sid());    
  }
  
  @Test
  public void verifyHeadingGoods_nomenclature_item_idProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setGoods_nomenclature_item_id(HEADING_GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(HEADING_GOODS_NOMENCLATURE_ITEM_ID, heading.getGoods_nomenclature_item_id());    
  }
  
  @Test
  public void verifyHeadingDeclarableProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setDeclarable(HEADING_DECLARABLE);

    //Then
    assertEquals(HEADING_DECLARABLE, heading.isDeclarable());    
  }
  
  @Test
  public void verifyHeadingDescriptionProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setDescription(HEADING_DESCRIPTION);

    //Then
    assertEquals(HEADING_DESCRIPTION, heading.getDescription());    
  }
  
  @Test
  public void verifyHeadingProducline_suffixProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setProducline_suffix(HEADING_PRODUCLINE_SUFFIX);

    //Then
    assertEquals(HEADING_PRODUCLINE_SUFFIX, heading.getProducline_suffix());    
  }
  
  @Test
  public void verifyHeadingLeafProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setLeaf(HEADING_LEAF);

    //Then
    assertEquals(HEADING_LEAF, heading.isLeaf());    
  }
  
  @Test
  public void verifyHeadingDescription_plainProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setDescription_plain(HEADING_DESCRIPTION_PLAIN);

    //Then
    assertEquals(HEADING_DESCRIPTION_PLAIN, heading.getDescription_plain());    
  }
  
  @Test
  public void verifyHeadingFormatted_descriptionProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    
    //When
    heading.setFormatted_description(HEADING_FORMATTED_DESCRIPTION);

    //Then
    assertEquals(HEADING_FORMATTED_DESCRIPTION, heading.getFormatted_description());    
  }
  
  @Test
  public void verifyHeadingChildrenProperty() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    Children child = new Children();
    List<Children> children = Arrays.asList(child);
    
    //When
    heading.setChildren(children);

    //Then
    assertEquals(1, heading.getChildren().size());
  }
  
  @Test
  public void verifyHeadingToString() {
    //Given
    ChapterHeading heading = new ChapterHeading();
    Children child = new Children();
    List<Children> children = Arrays.asList(child);

    String expResult = "ChapterHeading{" + "goods_nomenclature_sid=" + HEADING_GOODS_NOMENCLATURE_SID + 
              ", goods_nomenclature_item_id=" + HEADING_GOODS_NOMENCLATURE_ITEM_ID + 
              ", declarable=" + HEADING_DECLARABLE + 
              ", description=" + HEADING_DESCRIPTION + 
              ", producline_suffix=" + HEADING_PRODUCLINE_SUFFIX + 
              ", leaf=" + HEADING_LEAF + 
              ", description_plain=" + HEADING_DESCRIPTION_PLAIN + 
              ", formatted_description=" + HEADING_FORMATTED_DESCRIPTION + 
              ", children=" + children.toString() + '}';
    //When
    heading.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID);
    heading.setGoods_nomenclature_item_id(HEADING_GOODS_NOMENCLATURE_ITEM_ID);
    heading.setDeclarable(HEADING_DECLARABLE);
    heading.setDescription(HEADING_DESCRIPTION);
    heading.setProducline_suffix(HEADING_PRODUCLINE_SUFFIX);
    heading.setLeaf(HEADING_LEAF);
    heading.setDescription_plain(HEADING_DESCRIPTION_PLAIN);
    heading.setFormatted_description(HEADING_FORMATTED_DESCRIPTION);
    heading.setChildren(children);
    //Then
    assertEquals(expResult, heading.toString());
  }
}