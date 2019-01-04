package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class Definition {
  
  private String initial_volume;
  private String validity_start_date;
  private String validity_end_date;
  private String status;
  private String description;
  private String measurement_unit;
  private String measurement_unit_qualifier;
  private String monetary_unit;
  private String balance;
  private String last_allocation_date;
  private String suspension_period_start_date;
  private String suspension_period_end_date;
  private String blocking_period_start_date;
  private String blocking_period_end_date;

  public Definition() {
  }

  public String getInitial_volume() {
    return initial_volume;
  }

  public void setInitial_volume(String initial_volume) {
    this.initial_volume = initial_volume;
  }

  public String getValidity_start_date() {
    return validity_start_date;
  }

  public void setValidity_start_date(String validity_start_date) {
    this.validity_start_date = validity_start_date;
  }

  public String getValidity_end_date() {
    return validity_end_date;
  }

  public void setValidity_end_date(String validity_end_date) {
    this.validity_end_date = validity_end_date;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMeasurement_unit() {
    return measurement_unit;
  }

  public void setMeasurement_unit(String measurement_unit) {
    this.measurement_unit = measurement_unit;
  }

  public String getMeasurement_unit_qualifier() {
    return measurement_unit_qualifier;
  }

  public void setMeasurement_unit_qualifier(String measurement_unit_qualifier) {
    this.measurement_unit_qualifier = measurement_unit_qualifier;
  }

  public String getMonetary_unit() {
    return monetary_unit;
  }

  public void setMonetary_unit(String monetary_unit) {
    this.monetary_unit = monetary_unit;
  }


  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getLast_allocation_date() {
    return last_allocation_date;
  }

  public void setLast_allocation_date(String last_allocation_date) {
    this.last_allocation_date = last_allocation_date;
  }

  public String getSuspension_period_start_date() {
    return suspension_period_start_date;
  }

  public void setSuspension_period_start_date(String suspension_period_start_date) {
    this.suspension_period_start_date = suspension_period_start_date;
  }

  public String getSuspension_period_end_date() {
    return suspension_period_end_date;
  }

  public void setSuspension_period_end_date(String suspension_period_end_date) {
    this.suspension_period_end_date = suspension_period_end_date;
  }

  public String getBlocking_period_start_date() {
    return blocking_period_start_date;
  }

  public void setBlocking_period_start_date(String blocking_period_start_date) {
    this.blocking_period_start_date = blocking_period_start_date;
  }

  public String getBlocking_period_end_date() {
    return blocking_period_end_date;
  }

  public void setBlocking_period_end_date(String blocking_period_end_date) {
    this.blocking_period_end_date = blocking_period_end_date;
  }

  @Override
  public String toString() {
    return "Definition{" + "initial_volume=" + initial_volume 
            + ", validity_start_date=" + validity_start_date 
            + ", validity_end_date=" + validity_end_date 
            + ", status=" + status 
            + ", description=" + description 
            + ", measurement_unit=" + measurement_unit
            + ", measurement_unit_qualifier=" + measurement_unit_qualifier 
            + ", monetary_unit=" + monetary_unit
            + ", balance=" + balance 
            + ", last_allocation_date=" + last_allocation_date 
            + ", suspension_period_start_date=" + suspension_period_start_date 
            + ", suspension_period_end_date=" + suspension_period_end_date 
            + ", blocking_period_start_date=" + blocking_period_start_date 
            + ", blocking_period_end_date=" + blocking_period_end_date + '}';
  }  
  
}
