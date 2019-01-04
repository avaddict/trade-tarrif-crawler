package uk.gov.defra.tracesx.tradetariff.dao.entities;

public class Footnote {

  private String code;
  private String description;
  private String formatted_description;

  public Footnote() {
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  @Override
  public String toString() {
    return "Footnote{" + "code=" + code
            + ", description=" + description
            + ", formatted_description=" + formatted_description + '}';
  }

}
