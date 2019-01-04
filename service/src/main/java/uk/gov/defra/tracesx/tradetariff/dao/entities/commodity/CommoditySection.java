package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class CommoditySection {

  private String title;
  private int position;
  private String numeral;
  private String section_note;

  public CommoditySection() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getNumeral() {
    return numeral;
  }

  public void setNumeral(String numeral) {
    this.numeral = numeral;
  }

  public String getSection_note() {
    return section_note;
  }

  public void setSection_note(String section_note) {
    this.section_note = section_note;
  }

  @Override
  public String toString() {
    return "CommoditySection{" + "title=" + title
            + ", position=" + position
            + ", numeral=" + numeral
            + ", section_note=" + section_note + '}';
  }
}