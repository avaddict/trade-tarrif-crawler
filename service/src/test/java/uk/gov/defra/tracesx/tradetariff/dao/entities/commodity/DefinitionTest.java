package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefinitionTest {

  public static final String INITIAL_VOLUME = "24070.0";
  public static final String VALIDITY_START_DATE = "2018-07-01T00:00:00.000Z";
  public static final String VALIDITY_END_DATE = "2019-06-30T00:00:00.000Z";
  public static final String STATUS = "Open";
  public static final String DESCRIPTION = "Transfer from licence system to FCFS";
  public static final String MEASUREMENT_UNIT = "NAR";
  public static final String MONETARY_UNIT = "GBP";
  public static final String MEASUREMENT_UNIT_QUALIFIER = "unknown";
  public static final String BALANCE = "24070.0";
  public static final String LAST_ALLOCATION_DATE = "2018-07-02T00:00:00.000Z";
  public static final String SUSPENSION_PERIOD_START_DATE = "2018-07-03T00:00:00.000Z";
  public static final String SUSPENSION_PERIOD_END_DATE = "2018-07-04T00:00:00.000Z";
  public static final String BLOCKING_PERIOD_START_DATE = "2018-07-05T00:00:00.000Z";
  public static final String BLOCKING_PERIOD_END_DATE = "2018-07-06T00:00:00.000Z";

  public DefinitionTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void validateInitial_volumeProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setInitial_volume(INITIAL_VOLUME);

    //Then
    assertEquals(INITIAL_VOLUME, definition.getInitial_volume());
  }

  @Test
  public void validateValidity_start_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setValidity_start_date(VALIDITY_START_DATE);

    //Then
    assertEquals(VALIDITY_START_DATE, definition.getValidity_start_date());
  }

  @Test
  public void validateValidity_end_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setValidity_end_date(VALIDITY_END_DATE);

    //Then
    assertEquals(VALIDITY_END_DATE, definition.getValidity_end_date());
  }

  @Test
  public void validateStatusProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setStatus(STATUS);

    //Then
    assertEquals(STATUS, definition.getStatus());
  }

  @Test
  public void validateDescriptionProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, definition.getDescription());
  }

  @Test
  public void validateMeasurement_unitProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setMeasurement_unit(MEASUREMENT_UNIT);

    //Then
    assertEquals(MEASUREMENT_UNIT, definition.getMeasurement_unit());
  }

  @Test
  public void validateMeasurement_unit_qualifierProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setMeasurement_unit_qualifier(MEASUREMENT_UNIT_QUALIFIER);

    //Then
    assertEquals(MEASUREMENT_UNIT_QUALIFIER,
            definition.getMeasurement_unit_qualifier());
  }

  @Test
  public void validateMonetary_unitProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setMonetary_unit(MONETARY_UNIT);

    //Then
    assertEquals(MONETARY_UNIT, definition.getMonetary_unit());
  }

  @Test
  public void validateBalanceProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setBalance(BALANCE);

    //Then
    assertEquals(BALANCE, definition.getBalance());
  }

  @Test
  public void validateLast_allocation_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setLast_allocation_date(LAST_ALLOCATION_DATE);

    //Then
    assertEquals(LAST_ALLOCATION_DATE, definition.getLast_allocation_date());
  }

  @Test
  public void validateSuspension_period_start_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setSuspension_period_start_date(SUSPENSION_PERIOD_START_DATE);

    //Then
    assertEquals(SUSPENSION_PERIOD_START_DATE,
            definition.getSuspension_period_start_date());
  }

  @Test
  public void validateSuspension_period_end_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setSuspension_period_end_date(SUSPENSION_PERIOD_END_DATE);

    //Then
    assertEquals(SUSPENSION_PERIOD_END_DATE,
            definition.getSuspension_period_end_date());
  }

  @Test
  public void validateBlocking_period_start_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setBlocking_period_start_date(BLOCKING_PERIOD_START_DATE);

    //Then
    assertEquals(BLOCKING_PERIOD_START_DATE,
            definition.getBlocking_period_start_date());
  }

  @Test
  public void validateBlocking_period_end_dateProperty() {
    //Given
    Definition definition = new Definition();

    //When
    definition.setBlocking_period_end_date(BLOCKING_PERIOD_END_DATE);

    //Then
    assertEquals(BLOCKING_PERIOD_END_DATE,
            definition.getBlocking_period_end_date());
  }

  @Test
  public void testToString() {
    //Given
    Definition definition = new Definition();
    String expResult = "Definition{" + "initial_volume=" + INITIAL_VOLUME
            + ", validity_start_date=" + VALIDITY_START_DATE
            + ", validity_end_date=" + VALIDITY_END_DATE
            + ", status=" + STATUS
            + ", description=" + DESCRIPTION
            + ", measurement_unit=" + MEASUREMENT_UNIT
            + ", measurement_unit_qualifier=" + MEASUREMENT_UNIT_QUALIFIER
            + ", monetary_unit=" + MONETARY_UNIT
            + ", balance=" + BALANCE
            + ", last_allocation_date=" + LAST_ALLOCATION_DATE
            + ", suspension_period_start_date=" + SUSPENSION_PERIOD_START_DATE
            + ", suspension_period_end_date=" + SUSPENSION_PERIOD_END_DATE
            + ", blocking_period_start_date=" + BLOCKING_PERIOD_START_DATE
            + ", blocking_period_end_date=" + BLOCKING_PERIOD_END_DATE + '}';

    //When
    definition.setInitial_volume(INITIAL_VOLUME);
    definition.setValidity_start_date(VALIDITY_START_DATE);
    definition.setValidity_end_date(VALIDITY_END_DATE);
    definition.setStatus(STATUS);
    definition.setDescription(DESCRIPTION);
    definition.setMeasurement_unit(MEASUREMENT_UNIT);
    definition.setMeasurement_unit_qualifier(MEASUREMENT_UNIT_QUALIFIER);
    definition.setMonetary_unit(MONETARY_UNIT);
    definition.setBalance(BALANCE);
    definition.setLast_allocation_date(LAST_ALLOCATION_DATE);
    definition.setSuspension_period_start_date(SUSPENSION_PERIOD_START_DATE);
    definition.setSuspension_period_end_date(SUSPENSION_PERIOD_END_DATE);
    definition.setBlocking_period_start_date(BLOCKING_PERIOD_START_DATE);
    definition.setBlocking_period_end_date(BLOCKING_PERIOD_END_DATE);

    //Then
    assertEquals(expResult, definition.toString());
  }

}
