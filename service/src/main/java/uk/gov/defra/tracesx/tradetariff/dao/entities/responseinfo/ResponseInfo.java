package uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo;

import java.util.List;

public class ResponseInfo {

  private List<Link> links;

  public ResponseInfo() {
  }

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  @Override
  public String toString() {
    return "ResponseInfo{" + "links=" + (links == null ? "" : links) + '}';
  }
}
