package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class ExcludedCountry {

  private String geographical_area_id;
  private String description;

  public ExcludedCountry() {
  }

  public String getGeographical_area_id() {
    return geographical_area_id;
  }

  public void setGeographical_area_id(String geographical_area_id) {
    this.geographical_area_id = geographical_area_id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "ExcludedCountry{" + "geographical_area_id=" + geographical_area_id + ", description=" + description + '}';
  }


}
