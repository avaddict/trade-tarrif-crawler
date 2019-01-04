package uk.gov.defra.tracesx.tradetariff.dao.entities;

public class MeasureType {

  private String id;
  private String description;

  public MeasureType() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "MeasureType{" + "id=" + id
            + ", description=" + description + '}';
  }
}