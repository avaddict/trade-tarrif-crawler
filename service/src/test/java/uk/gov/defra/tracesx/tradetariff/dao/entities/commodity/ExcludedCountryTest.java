package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ExcludedCountryTest {

  private static final String GEOGRAPHICAL_AREA_ID = "AD";
  private static final String DESCRIPTION = "Andorra";

  public ExcludedCountryTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyGeographical_area_idProperty() {
    //Given
    ExcludedCountry excludedCountry = new ExcludedCountry();

    //When
    excludedCountry.setGeographical_area_id(GEOGRAPHICAL_AREA_ID);

    //Then
    assertEquals(GEOGRAPHICAL_AREA_ID, excludedCountry.getGeographical_area_id());
  }

  @Test
  public void VerifyDescriptionProperty() {
    //Given
    ExcludedCountry excludedCountry = new ExcludedCountry();

    //When
    excludedCountry.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, excludedCountry.getDescription());
  }

  public void VerifyToString() {
    //Given
    ExcludedCountry excludedCountry = new ExcludedCountry();
    String expResult = "ExcludedCountry{" +
            "geographical_area_id=" + GEOGRAPHICAL_AREA_ID +
            ", description=" + DESCRIPTION + '}';

    //When
    excludedCountry.setGeographical_area_id(GEOGRAPHICAL_AREA_ID);
    excludedCountry.setDescription(DESCRIPTION);

    //Then
    assertEquals(expResult, excludedCountry);
  }
}
