package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.MeasureCondition;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MeasureConditionTest {

  private static final String CONDITION = "B1: Presentation of a certificate/licence/document";
  private static final String DOCUMENT_CODE = "N853";
  private static final String REQUIREMENT = "UN/EDIFACT certificates: Common Veterinary Entry Document (CVED) in accordance with Regulation (EC) No. 136/2004, used for veterinary check on products";
  private static final String ACTION = "The entry into free circulation is not allowed";
  private static final String DUTY_EXPRESSION = "Test Duty Expression";

  public MeasureConditionTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  // Measures Condition Tests
  @Test
  public void verifyConditionProperty() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();

    //When
    measureCondition.setCondition(CONDITION);

    //Then
    assertEquals(CONDITION, measureCondition.getCondition());
  }

  @Test
  public void verifyDocument_codeProperty() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();

    //When
    measureCondition.setDocument_code(DOCUMENT_CODE);

    //Then
    assertEquals(DOCUMENT_CODE, measureCondition.getDocument_code());
  }

  @Test
  public void verifyRequirementProperty() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();

    //When
    measureCondition.setRequirement(REQUIREMENT);

    //Then
    assertEquals(REQUIREMENT, measureCondition.getRequirement());
  }

  @Test
  public void verifyActionProperty() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();

    //When
    measureCondition.setAction(ACTION);

    //Then
    assertEquals(ACTION, measureCondition.getAction());
  }

  @Test
  public void verifyDuty_expressionProperty() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();

    //When
    measureCondition.setDuty_expression(DUTY_EXPRESSION);

    //Then
    assertEquals(DUTY_EXPRESSION, measureCondition.getDuty_expression());
  }

  @Test
  public void verifyToString() {
    //Given
    MeasureCondition measureCondition = new MeasureCondition();
    String expResult = "MeasureCondition{" + "condition=" + CONDITION
            + ", document_code=" + DOCUMENT_CODE
            + ", requirement=" + REQUIREMENT
            + ", action=" + ACTION
            + ", duty_expression=" + DUTY_EXPRESSION + '}';
  
    //When
    measureCondition.setCondition(CONDITION);
    measureCondition.setDocument_code(DOCUMENT_CODE);
    measureCondition.setRequirement(REQUIREMENT);
    measureCondition.setAction(ACTION);
    measureCondition.setDuty_expression(DUTY_EXPRESSION);

    //Then
    assertEquals(expResult, measureCondition.toString());
  }

}
