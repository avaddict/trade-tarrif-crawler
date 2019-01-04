package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.Ancestor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AncestorTest {

  private static final String PRODUCLINE_SUFFIX = "10";
  private static final String DESCRIPTION = "MEAT AND EDIBLE MEAT OFFAL";
  private static final int NUMBER_INDENTS = 2;
  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0200000000";
  private static final String FORMATTED_DESCRIPTION = "Meat and edible meat offal";
  private static final String DESCRIPTION_PLAIN = "Meat and edible meat offal";

  public AncestorTest() {
  }
  
  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyProducline_suffixProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setProducline_suffix(PRODUCLINE_SUFFIX);

    //Then
    assertEquals(PRODUCLINE_SUFFIX, ancestor.getProducline_suffix());
  }

  @Test
  public void verifyDescriptionProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, ancestor.getDescription());
  }

  @Test
  public void verifyNumber_indentsProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setNumber_indents(NUMBER_INDENTS);

    //Then
    assertEquals(NUMBER_INDENTS, ancestor.getNumber_indents());
  }

  @Test
  public void verifyGoods_nomenclature_item_idProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, ancestor.getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyFormatted_descriptionProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, ancestor.getFormatted_description());
  }

  @Test
  public void verifyDescription_plainProperty() {
    //Given
    Ancestor ancestor = new Ancestor();

    //When
    ancestor.setDescription_plain(DESCRIPTION_PLAIN);

    //Then
    assertEquals(DESCRIPTION_PLAIN, ancestor.getDescription_plain());
  }

  @Test
  public void verifyToString() {
    //Given
    Ancestor ancestor = new Ancestor();
    String expResult = "Ancestor{" + "producline_suffix=" + PRODUCLINE_SUFFIX
            + ", description=" + DESCRIPTION
            + ", number_indents=" + NUMBER_INDENTS
            + ", goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID
            + ", formatted_description=" + FORMATTED_DESCRIPTION
            + ", description_plain=" + DESCRIPTION_PLAIN + '}';

    //When
    ancestor.setProducline_suffix(PRODUCLINE_SUFFIX);
    ancestor.setDescription(DESCRIPTION);
    ancestor.setNumber_indents(NUMBER_INDENTS);
    ancestor.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    ancestor.setFormatted_description(FORMATTED_DESCRIPTION);
    ancestor.setDescription_plain(DESCRIPTION_PLAIN);

    //Then
    assertEquals(expResult, ancestor.toString());
  }

  /*
  
 expected:<Ancestor[s{producline_suffix=10, description=MEAT AND EDIBLE MEAT OFFAL, number_indents=2, goods_nomenclature_item_id=0200000000, formatted_description=Meat and edible meat offa]l}> but was:
          <Ancestor[{ producline_suffix=10, description=MEAT AND EDIBLE MEAT OFFAL, number_indents=2, goods_nomenclature_item_id=0200000000, formatted_description=Meat and edible meat offal, description_plain=nul]l}>
  */
}
