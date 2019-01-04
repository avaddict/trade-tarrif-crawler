package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class MeasureCondition {

  private String condition;
  private String document_code;
  private String requirement;
  private String action;
  private String duty_expression;

  public MeasureCondition() {
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public String getDocument_code() {
    return document_code;
  }

  public void setDocument_code(String document_code) {
    this.document_code = document_code;
  }

  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getDuty_expression() {
    return duty_expression;
  }

  public void setDuty_expression(String duty_expression) {
    this.duty_expression = duty_expression;
  }

  @Override
  public String toString() {
    return "MeasureCondition{" + "condition=" + condition
            + ", document_code=" + document_code
            + ", requirement=" + requirement
            + ", action=" + action
            + ", duty_expression=" + duty_expression + '}';
  }
}