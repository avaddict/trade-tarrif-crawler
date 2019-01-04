package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.MeasureType;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;

public class MeasureTest {

  private static final int ID = -471014;
  private static final String ORIGIN = "uk";
  private static final String EFFECTIVE_START_DATE = "2017-06-01T00:00:00.000Z";
  private static final String EFFECTIVE_END_DATE = "2018-06-01T00:00:00.000Z";
  private static final boolean IMPORT = true;
  
  private static final String MEASURE_CONDITION_CONDITION = "B1: Presentation of a certificate/licence/document";
  private static final String MEASURE_CONDITION_CONDITION2 = "B2: Presentation of a certificate/licence/document";
  
  private static final String EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID = "AD";
  private static final String EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID2 = "AE";
  private static final String EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID3 = "GB";

  private static final String FOOTNOTE_CODE = "03026";
  private static final String FOOTNOTE_CODE2 = "03027";

  private static final boolean EXCISE = true;
  private static final boolean VAT = true;

  private static final String MEASURE_TYPE_ID = "VTS";

  private static final String DUTY_EXPRESSION_BASE = "20.00 %";
  
  private static final String GEOGRAPHICAL_AREA_ID = "AD";

  public MeasureTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void verifyIdProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setId(ID);

    //Then
    assertEquals(ID, measure.getId());
  }

  @Test
  public void verifyOriginProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setOrigin(ORIGIN);

    //Then
    assertEquals(ORIGIN, measure.getOrigin());
  }

  @Test
  public void verifyEffective_start_dateProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setEffective_start_date(EFFECTIVE_START_DATE);

    //Then
    assertEquals(EFFECTIVE_START_DATE, measure.getEffective_start_date());
  }

  @Test
  public void verifyEffective_end_dateProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setEffective_end_date(EFFECTIVE_END_DATE);

    //Then
    assertEquals(EFFECTIVE_END_DATE, measure.getEffective_end_date());
  }

  @Test
  public void verifyImportProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setImport(IMPORT);

    //Then
    assertEquals(IMPORT, measure.isImport());
  }

  @Test
  public void verifyMeasure_conditionsProperty() {
    //Given
    Measure measure = new Measure();
    MeasureCondition measureCondition = new MeasureCondition();
    MeasureCondition measureCondition2 = new MeasureCondition();
    List<MeasureCondition> measureConditionList =
            Arrays.asList(measureCondition, measureCondition2);

    //When
    measureCondition.setCondition(MEASURE_CONDITION_CONDITION);
    measureCondition2.setCondition(MEASURE_CONDITION_CONDITION2);
    measure.setMeasure_conditions(measureConditionList);

    //Then
    assertEquals(MEASURE_CONDITION_CONDITION, 
      measure.getMeasure_conditions().get(0).getCondition());
    assertEquals(MEASURE_CONDITION_CONDITION2, 
      measure.getMeasure_conditions().get(1).getCondition());
  }

  @Test
  public void verifyExcluded_countriesProperty() {
    //Given
    Measure measure = new Measure();
    ExcludedCountry excludedCountry = new ExcludedCountry();
    ExcludedCountry excludedCountry2 = new ExcludedCountry();
    ExcludedCountry excludedCountry3 = new ExcludedCountry();
    List<ExcludedCountry> excludedCountries =
            Arrays.asList(excludedCountry,
                    excludedCountry2,
                    excludedCountry3);

    //When
    excludedCountry.setGeographical_area_id(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID);
    excludedCountry2.setGeographical_area_id(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID);
    excludedCountry3.setGeographical_area_id(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID3);
    measure.setExcluded_countries(excludedCountries);

    //Then
    assertEquals(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID, 
      measure.getExcluded_countries().get(0).getGeographical_area_id());
    assertEquals(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID, 
      measure.getExcluded_countries().get(1).getGeographical_area_id());
    assertEquals(EXCLUDED_COUNTRY_GEOGRAPHICAL_AREA_ID3, 
      measure.getExcluded_countries().get(2).getGeographical_area_id());
  }

  @Test
  public void verifyFootnotesProperty() {
    //Given
    Measure measure = new Measure();
    Footnote footnote = new Footnote();
    Footnote footnote2 = new Footnote();
    List<Footnote> footnoteList = Arrays.asList(footnote, footnote2);

    //When
    footnote.setCode(FOOTNOTE_CODE);
    footnote2.setCode(FOOTNOTE_CODE2);
    measure.setFootnotes(footnoteList);

    //Then
    assertEquals(FOOTNOTE_CODE, 
      measure.getFootnotes().get(0).getCode());
    assertEquals(FOOTNOTE_CODE2, 
      measure.getFootnotes().get(1).getCode());
  }
  
  @Test
  public void verifyOrder_numberProperty() {
    //Given
    Measure measure = new Measure();
    OrderNumber orderNumber = new OrderNumber();
    
    //When
    measure.setOrder_number(orderNumber);

    //Then
    assertTrue(measure.getOrder_number() != null);    
  }
  
  @Test
  public void verifyExciseProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setExcise(EXCISE);

    //Then
    assertEquals(EXCISE, measure.isExcise());    
  }

  @Test
  public void verifyVatProperty() {
    //Given
    Measure measure = new Measure();
    
    //When
    measure.setVat(VAT);

    //Then
    assertEquals(VAT, measure.isVat());    
  }

  @Test
  public void verifyMeasureTypeProperty() {
    //Given
    Measure measure = new Measure();
    MeasureType measureType = new MeasureType();
    
    //When
    measureType.setId(MEASURE_TYPE_ID);
    measure.setMeasure_type(measureType);

    //Then
    assertEquals(MEASURE_TYPE_ID, measure.getMeasure_type().getId());    
  }
  
  @Test
  public void verifyDutyExpressionProperty() {
    //Given
    Measure measure = new Measure();
    DutyExpression dutyExpression = new DutyExpression();
    
    //When
    dutyExpression.setBase(DUTY_EXPRESSION_BASE);
    measure.setDuty_expression(dutyExpression);

    //Then
    assertEquals(DUTY_EXPRESSION_BASE, measure.getDuty_expression().getBase());    
  }  
  
  @Test
  public void verifyGeographical_areaProperty() {
    //Given
    Measure measure = new Measure();
    GeographicalArea geographicalArea = new GeographicalArea();
    ChildGeographicalArea child = new ChildGeographicalArea();

    //When
    child.setId(GEOGRAPHICAL_AREA_ID);
    List<ChildGeographicalArea> list = Arrays.asList(child);
    geographicalArea.setChildren_geographical_areas(list);
    measure.setGeographical_area(geographicalArea);

    //Then
    assertEquals(GEOGRAPHICAL_AREA_ID,
            measure.getGeographical_area().getChildren_geographical_areas().get(0).getId());
  }

  @Test
  public void verifyToString() {
    //Given
    Measure measure = new Measure();
    List<MeasureCondition> measureConditionList = Lists.emptyList();
    List<ExcludedCountry> excludedCountries = Lists.emptyList();
    List<Footnote> footnoteList = Lists.emptyList();
    OrderNumber orderNumber = new OrderNumber();
    MeasureType measureType = new MeasureType();
    DutyExpression dutyExpression = new DutyExpression();
    LegalAct legalAct = new LegalAct();
    LegalAct suspensionLegalAct = new LegalAct();
    GeographicalArea geographicalArea = new GeographicalArea();

    String expResult = "Measure{" + "id=" + ID
            + ", origin=" + ORIGIN
            + ", effective_start_date=" + EFFECTIVE_START_DATE
            + ", effective_end_date=" + EFFECTIVE_END_DATE
            + ", _import=" + IMPORT
            + ", measure_conditions=" + measureConditionList
            + ", excluded_countries=" + excludedCountries
            + ", footnotes=" + footnoteList
            + ", order_number=" + orderNumber
            + ", excise=" + EXCISE
            + ", vat=" + VAT
            + ", measure_type=" + measureType
            + ", duty_expression=" + dutyExpression
            + ", legal_act=" + legalAct
            + ", suspension_legal_act=" + suspensionLegalAct
            + ", geographical_area=" + geographicalArea
            + '}';

    //When
    measure.setId(ID);
    measure.setOrigin(ORIGIN);
    measure.setEffective_start_date(EFFECTIVE_START_DATE);
    measure.setEffective_end_date(EFFECTIVE_END_DATE);
    measure.setImport(IMPORT);
    measure.setMeasure_conditions(measureConditionList);
    measure.setExcluded_countries(excludedCountries);
    measure.setFootnotes(footnoteList);
    measure.setOrder_number(orderNumber);
    measure.setExcise(EXCISE);
    measure.setVat(VAT);
    measure.setMeasure_type(measureType);
    measure.setDuty_expression(dutyExpression);
    measure.setLegal_act(legalAct);
    measure.setSuspension_legal_act(suspensionLegalAct);
    measure.setGeographical_area(geographicalArea);
    
    //Then
    assertEquals(expResult, measure.toString());
  }
  
}