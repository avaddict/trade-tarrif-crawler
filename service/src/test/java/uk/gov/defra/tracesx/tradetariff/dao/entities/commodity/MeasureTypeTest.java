package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.MeasureType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MeasureTypeTest {

  private static final String ID = "VTS";
  private static final String DESCRIPTION = "VAT standard rate";

  public MeasureTypeTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyIdProperty() {
    //Given
    MeasureType measureType = new MeasureType();

    //When
    measureType.setId(ID);

    //Then
    assertEquals(ID, measureType.getId());
  }

  @Test
  public void VerifyDescriptionProperty() {
    //Given
    MeasureType measureType = new MeasureType();

    //When
    measureType.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, measureType.getDescription());
  }

  @Test
  public void testToString() {
    //Given
    MeasureType measureType = new MeasureType();
    String expResult = "MeasureType{" + "id=" + ID
            + ", description=" + DESCRIPTION + '}';

    //When
    measureType.setId(ID);
    measureType.setDescription(DESCRIPTION);

    //Then
    assertEquals(expResult, measureType.toString());
  }

}
