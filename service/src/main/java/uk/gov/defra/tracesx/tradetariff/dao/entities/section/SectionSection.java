package uk.gov.defra.tracesx.tradetariff.dao.entities.section;

import java.util.List;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;

public class SectionSection {

  private int id;
  private int position;
  private String title;
  private String numeral;
  private String chapter_from;
  private String chapter_to;
  private List<SectionChapter> chapters;
  private String section_note;
  private ResponseInfo _response_info;

  public SectionSection() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getChapter_from() {
    return chapter_from;
  }

  public void setChapter_from(String chapter_from) {
    this.chapter_from = chapter_from;
  }

  public String getChapter_to() {
    return chapter_to;
  }

  public void setChapter_to(String chapter_to) {
    this.chapter_to = chapter_to;
  }

  public List<SectionChapter> getChapters() {
    return chapters;
  }

  public void setChapters(List<SectionChapter> chapters) {
    this.chapters = chapters;
  }

  public String getSection_note() {
    return section_note;
  }

  public void setSection_note(String section_note) {
    this.section_note = section_note;
  }

  public ResponseInfo get_response_info() {
    return _response_info;
  }

  public void set_response_info(ResponseInfo response_info) {
    this._response_info = response_info;
  }

  @Override
  public String toString() {
    return "SectionSection{" + "id=" + id + ", position=" + position
            + ", title=" + title
            + ", numeral=" + numeral
            + ", chapter_from=" + chapter_from
            + ", chapter_to=" + chapter_to
            + ", chapters=" + chapters
            + ", section_note=" + section_note
            + ", _response_info=" + _response_info + '}';
  }
}