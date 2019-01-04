package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingCommodity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;
import static org.junit.Assert.*;

public class HeadingCommodityTest {
  
  private static final String DESCRIPTION = "Cattle";
  private static final int NUMBER_INDENTS = 1;
  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0102210000";
  private static final boolean LEAF = false;
  private static final int GOODS_NOMENCLATURE_SID = 94053;
  private static final String FORMATTED_DESCRIPTION = "Cattle - formatted";
  private static final String DESCRIPTION_PLAIN = "Cattle - plain";
  private static final String PRODUCLINE_SUFFIX = "10";
  private static final int PARENT_SID = 94053;
      
  public HeadingCommodityTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void verifyCommodityDescriptionProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, commodity.getDescription());    
  }
  
  @Test
  public void verifyCommodityNumber_indentsProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setNumber_indents(NUMBER_INDENTS);

    //Then
    assertEquals(NUMBER_INDENTS, commodity.getNumber_indents());    
  }
  
  @Test
  public void verifyCommodityGoods_nomenclature_item_idProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, commodity.getGoods_nomenclature_item_id());
  }
  
  @Test
  public void verifyCommodityLeafProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setLeaf(LEAF);

    //Then
    assertEquals(LEAF, commodity.isLeaf());
  }

  @Test
  public void verifyCommodityGoods_nomenclature_sidProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_SID, commodity.getGoods_nomenclature_sid());
  }
  
  @Test
  public void verifyCommodityFormatted_descriptionProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, commodity.getFormatted_description());
  }
  
  @Test
  public void verifyCommodityDescription_plainProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setDescription_plain(DESCRIPTION_PLAIN);

    //Then
    assertEquals(DESCRIPTION_PLAIN, commodity.getDescription_plain());
  }

  @Test
  public void verifyProducline_suffixProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setProducline_suffix(PRODUCLINE_SUFFIX);

    //Then
    assertEquals(PRODUCLINE_SUFFIX, commodity.getProducline_suffix());
  }

  @Test
  public void verifyCommodityParent_sidProperty() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    
    //When
    commodity.setParent_sid(PARENT_SID);

    //Then
    assertEquals(PARENT_SID, commodity.getParent_sid());
  }
  
  
  @Test
  public void verifyCommodityToString() {
    //Given
    HeadingCommodity commodity = new HeadingCommodity();
    String expResult = "HeadingCommodity{" + "description=" + DESCRIPTION + 
              ", number_indents=" + NUMBER_INDENTS + 
              ", goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID + 
              ", leaf=" + LEAF + 
              ", goods_nomenclature_sid=" + GOODS_NOMENCLATURE_SID + 
              ", formatted_description=" + FORMATTED_DESCRIPTION + 
              ", description_plain=" + DESCRIPTION_PLAIN + 
              ", producline_suffix=" + PRODUCLINE_SUFFIX +
              ", parent_sid=" + PARENT_SID + '}';
    
    //When
    commodity.setDescription(DESCRIPTION);
    commodity.setNumber_indents(NUMBER_INDENTS);
    commodity.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    commodity.setLeaf(LEAF);
    commodity.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);
    commodity.setFormatted_description(FORMATTED_DESCRIPTION);
    commodity.setDescription_plain(DESCRIPTION_PLAIN);
    commodity.setProducline_suffix(PRODUCLINE_SUFFIX);
    commodity.setParent_sid(PARENT_SID);

    //Then
    assertEquals(expResult, commodity.toString());
  }

}
