package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.CommodityHeading;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CommodityHeadingTest {

  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0201000000";
  private static final String DESCRIPTION = "Meat of bovine animals, fresh or chilled";
  private static final String FORMATTED_DESCRIPTION = "Meat of bovine animals, fresh or chilled - formatted";
  private static final String DESCRIPTION_PLAIN = "Meat of bovine animals, fresh or chilled - plain";

  @Test
  public void verifyHeadingGoods_nomenclature_item_idProperty() {
    //Given
    CommodityHeading heading = new CommodityHeading();
    
    //When
    heading.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, heading.getGoods_nomenclature_item_id());    
  }
  
  @Test
  public void verifyHeadingDescriptionProperty() {
    //Given
    CommodityHeading heading = new CommodityHeading();
    
    //When
    heading.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, heading.getDescription());    
  }
  
  @Test
  public void verifyHeadingFormatted_descriptionProperty() {
    //Given
    CommodityHeading heading = new CommodityHeading();
    
    //When
    heading.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, heading.getFormatted_description());    
  }
  
  @Test
  public void verifyHeadingDescription_plainProperty() {
    //Given
    CommodityHeading heading = new CommodityHeading();
    
    //When
    heading.setDescription_plain(DESCRIPTION_PLAIN);

    //Then
    assertEquals(DESCRIPTION_PLAIN, heading.getDescription_plain());    
  }
  
  @Test
  public void verifyHeadingToString() {
    //Given
    CommodityHeading heading = new CommodityHeading();
    String expResult = "CommodityHeading{" + "goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID + 
              ", description=" + DESCRIPTION + 
              ", formatted_description=" + FORMATTED_DESCRIPTION + 
              ", description_plain=" + DESCRIPTION_PLAIN + '}';
    //When
    heading.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    heading.setDescription(DESCRIPTION);
    heading.setFormatted_description(FORMATTED_DESCRIPTION);
    heading.setDescription_plain(DESCRIPTION_PLAIN);
    //Then
    assertEquals(expResult, heading.toString());
  }

}
