package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

public class HeadingSection {

  private int position;
  private String title;
  private String numeral;
  private String section_note;

  public HeadingSection() {
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
    return "HeadingSection{" + "position=" + position
            + ", title=" + title
            + ", numeral=" + numeral
            + ", section_note=" + section_note + '}';
  }
}
