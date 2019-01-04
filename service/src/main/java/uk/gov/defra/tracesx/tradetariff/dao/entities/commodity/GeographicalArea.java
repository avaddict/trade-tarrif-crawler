package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import java.util.List;

public class GeographicalArea extends ChildGeographicalArea {

  private List<ChildGeographicalArea> children_geographical_areas;

  public GeographicalArea() {
  }

  public List<ChildGeographicalArea> getChildren_geographical_areas() {
    return children_geographical_areas;
  }

  public void setChildren_geographical_areas(List<ChildGeographicalArea> children_geographical_areas) {
    this.children_geographical_areas = children_geographical_areas;
  }

  @Override
  public String toString() {
    return "GeographicalArea{" +
           ", children_geographical_areas=" +
            children_geographical_areas + '}';
  }
}