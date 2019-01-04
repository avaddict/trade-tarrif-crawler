package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.LegalAct;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LegalActTest {

  private static final String GENERATING_REGULATION_CODE = "R0160/17";
  private static final String URL = "http://eur-lex.europa.eu/search.html?whOJ=NO_OJ%3D27,YEAR_OJ%3D2017,PAGE_FIRST%3D0001&DB_COLL_OJ=oj-l&type=advanced&lang=en";
  private static final boolean SUSPENDED = false;
  private static final String VALIDITY_END_DATE = "2017-02-04T00:00:00.000Z";
  private static final String VALIDITY_START_DATE = "2016-02-04T00:00:00.000Z";
  private static final String OFFICIALJOURNAL_NUMBER = "L 27";
  private static final int OFFICIALJOURNAL_PAGE = 1;
  private static final String PUBLISHED_DATE = "2017-02-01";

  public LegalActTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void verifyGenerating_regulation_codeProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setGenerating_regulation_code(GENERATING_REGULATION_CODE);

    //Then
    assertEquals(GENERATING_REGULATION_CODE, legalAct.getGenerating_regulation_code());
  }

  @Test
  public void verifyUrlProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setUrl(URL);

    //Then
    assertEquals(URL, legalAct.getUrl());
  }

  @Test
  public void verifySuspendedProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setSuspended(SUSPENDED);

    //Then
    assertEquals(SUSPENDED, legalAct.isSuspended());
  }

  @Test
  public void verifyValidity_end_dateProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setValidity_end_date(VALIDITY_END_DATE);

    //Then
    assertEquals(VALIDITY_END_DATE, legalAct.getValidity_end_date());
  }

  @Test
  public void verifyValidity_start_dateProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setValidity_start_date(VALIDITY_START_DATE);

    //Then
    assertEquals(VALIDITY_START_DATE, legalAct.getValidity_start_date());
  }

  @Test
  public void verifyOfficialjournal_numberProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setOfficialjournal_number(OFFICIALJOURNAL_NUMBER);

    //Then
    assertEquals(OFFICIALJOURNAL_NUMBER, legalAct.getOfficialjournal_number());
  }

  @Test
  public void verifyOfficialjournal_pageProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setOfficialjournal_page(OFFICIALJOURNAL_PAGE);

    //Then
    assertEquals(OFFICIALJOURNAL_PAGE, legalAct.getOfficialjournal_page());
  }

  @Test
  public void verifyPublished_dateProperty() {
    //Given
    LegalAct legalAct = new LegalAct();

    //When
    legalAct.setPublished_date(PUBLISHED_DATE);

    //Then
    assertEquals(PUBLISHED_DATE, legalAct.getPublished_date());
  }

  @Test
  public void verifyToString() {
    //Given
    LegalAct legalAct = new LegalAct();
    String expResult = "LegalAct{" + "generating_regulation_code="
            + GENERATING_REGULATION_CODE
            + ", url=" + URL
            + ", suspended=" + SUSPENDED
            + ", validity_end_date=" + VALIDITY_END_DATE
            + ", validity_start_date=" + VALIDITY_START_DATE
            + ", officialjournal_number=" + OFFICIALJOURNAL_NUMBER
            + ", officialjournal_page=" + OFFICIALJOURNAL_PAGE
            + ", published_date=" + PUBLISHED_DATE + '}';
    //When
    legalAct.setGenerating_regulation_code(GENERATING_REGULATION_CODE);
    legalAct.setUrl(URL);
    legalAct.setSuspended(SUSPENDED);
    legalAct.setValidity_end_date(VALIDITY_END_DATE);
    legalAct.setValidity_start_date(VALIDITY_START_DATE);
    legalAct.setOfficialjournal_number(OFFICIALJOURNAL_NUMBER);
    legalAct.setOfficialjournal_page(OFFICIALJOURNAL_PAGE);
    legalAct.setPublished_date(PUBLISHED_DATE);

    //Then
    assertEquals(expResult, legalAct.toString());
  }

}
