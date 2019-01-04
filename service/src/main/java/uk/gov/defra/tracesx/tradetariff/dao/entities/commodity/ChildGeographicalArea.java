package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class ChildGeographicalArea {

  private String id;
  private String description;

  public ChildGeographicalArea() {
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
    return "ChildGeographicalArea{" + "id=" + id
            + ", description=" + description + '}';
  }
}