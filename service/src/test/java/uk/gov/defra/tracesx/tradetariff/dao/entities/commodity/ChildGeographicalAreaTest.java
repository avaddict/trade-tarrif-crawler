package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.ChildGeographicalArea;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChildGeographicalAreaTest {

  private static final String ID = "AD";
  private static final String DESCRIPTION = "Andorra";

  public ChildGeographicalAreaTest() {
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
    ChildGeographicalArea childGeographicalArea = new ChildGeographicalArea();

    //When
    childGeographicalArea.setId(ID);

    //Then
    assertEquals(ID, childGeographicalArea.getId());
  }

  @Test
  public void VerifyDescriptionProperty() {
    //Given
    ChildGeographicalArea childGeographicalArea = new ChildGeographicalArea();

    //When
    childGeographicalArea.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, childGeographicalArea.getDescription());
  }

  @Test
  public void testToString() {
    //Given
    ChildGeographicalArea childGeographicalArea = new ChildGeographicalArea();
    String expResult = "ChildGeographicalArea{" + "id=" + ID
            + ", description=" + DESCRIPTION + '}';

    //When
    childGeographicalArea.setId(ID);
    childGeographicalArea.setDescription(DESCRIPTION);

    //Then
    assertEquals(expResult, childGeographicalArea.toString());
  }

}
