package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class LegalAct {

  private String generating_regulation_code;
  private String url;
  private boolean suspended;
  private String validity_end_date;
  private String validity_start_date;
  private String officialjournal_number;
  private int officialjournal_page;
  private String published_date;

  public LegalAct() {
  }

  public String getGenerating_regulation_code() {
    return generating_regulation_code;
  }

  public void setGenerating_regulation_code(String generating_regulation_code) {
    this.generating_regulation_code = generating_regulation_code;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(boolean suspended) {
    this.suspended = suspended;
  }

  public String getValidity_end_date() {
    return validity_end_date;
  }

  public void setValidity_end_date(String validity_end_date) {
    this.validity_end_date = validity_end_date;
  }

  public String getValidity_start_date() {
    return validity_start_date;
  }

  public void setValidity_start_date(String validity_start_date) {
    this.validity_start_date = validity_start_date;
  }

  public String getOfficialjournal_number() {
    return officialjournal_number;
  }

  public void setOfficialjournal_number(String officialjournal_number) {
    this.officialjournal_number = officialjournal_number;
  }

  public int getOfficialjournal_page() {
    return officialjournal_page;
  }

  public void setOfficialjournal_page(int officialjournal_page) {
    this.officialjournal_page = officialjournal_page;
  }

  public String getPublished_date() {
    return published_date;
  }

  public void setPublished_date(String published_date) {
    this.published_date = published_date;
  }

  @Override
  public String toString() {
    return "LegalAct{" + "generating_regulation_code="
            + generating_regulation_code
            + ", url=" + url
            + ", suspended=" + suspended
            + ", validity_end_date=" + validity_end_date
            + ", validity_start_date=" + validity_start_date
            + ", officialjournal_number=" + officialjournal_number
            + ", officialjournal_page=" + officialjournal_page
            + ", published_date=" + published_date + '}';
  }
}