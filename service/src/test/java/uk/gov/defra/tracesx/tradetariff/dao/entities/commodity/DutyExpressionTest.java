package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.DutyExpression;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DutyExpressionTest {

  private static final String BASE = "0.00 %";
  private static final String FORMATTED_BASE = "<span title=' EUR'>0.00</span> %";

  public DutyExpressionTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyBaseProperty() {
    //Given
    DutyExpression dutyExpression = new DutyExpression();

    //When
    dutyExpression.setBase(BASE);

    //Then
    assertEquals(BASE, dutyExpression.getBase());
  }

  @Test
  public void VerifyFormatted_baseProperty() {
    //Given
    DutyExpression dutyExpression = new DutyExpression();

    //When
    dutyExpression.setFormatted_base(FORMATTED_BASE);

    //Then
    assertEquals(FORMATTED_BASE, dutyExpression.getFormatted_base());
  }

  @Test
  public void testToString() {
    //Given
    DutyExpression dutyExpression = new DutyExpression();
    String expResult = "DutyExpression{" + "base=" + BASE
            + ", formatted_base=" + FORMATTED_BASE + '}';

    //When
    dutyExpression.setBase(BASE);
    dutyExpression.setFormatted_base(FORMATTED_BASE);

    //Then
    assertEquals(expResult, dutyExpression.toString());
  }

}
