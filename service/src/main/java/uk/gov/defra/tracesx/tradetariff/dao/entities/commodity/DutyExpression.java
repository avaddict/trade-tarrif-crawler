package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class DutyExpression {

  private String base;
  private String formatted_base;

  public DutyExpression() {
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public String getFormatted_base() {
    return formatted_base;
  }

  public void setFormatted_base(String formatted_base) {
    this.formatted_base = formatted_base;
  }

  @Override
  public String toString() {
    return "DutyExpression{" + "base=" + base
            + ", formatted_base=" + formatted_base + '}';
  }
}