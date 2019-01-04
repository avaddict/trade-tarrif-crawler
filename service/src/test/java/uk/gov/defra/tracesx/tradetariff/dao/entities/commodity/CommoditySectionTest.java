package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.CommoditySection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CommoditySectionTest {

  private static final String SECTION_TITLE = "Live animals; animal products";
  private static final int SECTION_POSITION = 1;
  private static final String SECTION_NUMERAL = "I";
  private static final String SECTION_SECTION_NOTE = "\"* 1\\\\. Any reference in this section";

  public CommoditySectionTest() {
  }
  
  @Test
  public void verifySectionTitleProperty() {
    //Given
    CommoditySection section = new CommoditySection();
    
    //When
    section.setTitle(SECTION_TITLE);

    //Then
    assertEquals(SECTION_TITLE, section.getTitle());
  }

  @Test
  public void verifySectionPositionProperty() {
    //Given
    CommoditySection section = new CommoditySection();
    
    //When
    section.setPosition(SECTION_POSITION);

    //Then
    assertEquals(SECTION_POSITION, section.getPosition());    
  }
  
  @Test
  public void verifySectionNumeralProperty() {
    //Given
    CommoditySection section = new CommoditySection();
    
    //When
    section.setNumeral(SECTION_NUMERAL);

    //Then
    assertEquals(SECTION_NUMERAL, section.getNumeral());    
  }
  
  @Test
  public void verifySectionSection_noteProperty() {
    //Given
    CommoditySection section = new CommoditySection();
    
    //When
    section.setSection_note(SECTION_SECTION_NOTE);

    //Then
    assertEquals(SECTION_SECTION_NOTE, section.getSection_note());    
  }
  
  @Test
  public void verifySectionToString() {
    //Given
    CommoditySection section = new CommoditySection();
    String expResult = "CommoditySection{" + "title=" + SECTION_TITLE + 
              ", position=" + SECTION_POSITION + 
              ", numeral=" + SECTION_NUMERAL + 
              ", section_note=" + SECTION_SECTION_NOTE + '}';
    //When
    section.setTitle(SECTION_TITLE);
    section.setPosition(SECTION_POSITION);
    section.setNumeral(SECTION_NUMERAL);
    section.setSection_note(SECTION_SECTION_NOTE);

    //Then
    assertEquals(expResult, section.toString());
  }

}
