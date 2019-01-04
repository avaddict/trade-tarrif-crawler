package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.ChildGeographicalArea;
import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.GeographicalArea;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GeographicalAreaTest {

  private static final String ID = "AD";
  private static final String ID2 = "DE";

  public GeographicalAreaTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyChildren_geographical_areasProperty() {
    //Given
    GeographicalArea geographicalArea = new GeographicalArea();
    ChildGeographicalArea child = new ChildGeographicalArea();
    ChildGeographicalArea child2 = new ChildGeographicalArea();
    child.setId(ID);
    child2.setId(ID2);
    List<ChildGeographicalArea> list = Arrays.asList(child, child2);


    //When
    geographicalArea.setChildren_geographical_areas(list);

    //Then
    assertEquals(ID,
            geographicalArea.getChildren_geographical_areas().get(0).getId());
    assertEquals(ID2,
            geographicalArea.getChildren_geographical_areas().get(1).getId());
  }

  @Test
  public void testToString() {
    //Given
    GeographicalArea geographicalArea = new GeographicalArea();
    ChildGeographicalArea child = new ChildGeographicalArea();
    ChildGeographicalArea child2 = new ChildGeographicalArea();
    child.setId(ID);
    child2.setId(ID2);
    List<ChildGeographicalArea> list = Arrays.asList(child, child2);
    String expResult = "GeographicalArea{" +
           ", children_geographical_areas=" +
            list.toString() + '}';

    //When
    geographicalArea.setChildren_geographical_areas(list);

    //Then
    assertEquals(expResult, geographicalArea.toString());
  }

}
