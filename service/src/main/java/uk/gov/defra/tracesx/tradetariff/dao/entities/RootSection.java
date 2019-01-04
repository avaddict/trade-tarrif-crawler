package uk.gov.defra.tracesx.tradetariff.dao.entities;

public class RootSection {

  private int id;
  private int position;
  private String title;
  private String numeral;
  private String chapter_from;
  private String chapter_to;
  private int section_note_id;

  public RootSection() {
  }

  public int getId() {
    return id;
  }

  public int getPosition() {
    return position;
  }

  public String getTitle() {
    return title;
  }

  public String getNumeral() {
    return numeral;
  }

  public String getChapter_from() {
    return chapter_from;
  }

  public String getChapter_to() {
    return chapter_to;
  }

  public int getSection_note_id() {
    return section_note_id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setNumeral(String numeral) {
    this.numeral = numeral;
  }

  public void setChapter_from(String chapterFrom) {
    this.chapter_from = chapterFrom;
  }

  public void setChapter_to(String chapterTo) {
    this.chapter_to = chapterTo;
  }

  public void setSection_note_id(int noteId) {
    this.section_note_id = noteId;
  }

  @Override
  public String toString() {
    return "RootSection{" + "id=" + id + ", position=" + position
            + ", title=" + title
            + ", numeral=" + numeral
            + ", chapter_from=" + chapter_from
            + ", chapter_to=" + chapter_to
            + ", section_note_id=" + section_note_id + '}';
  }
}
