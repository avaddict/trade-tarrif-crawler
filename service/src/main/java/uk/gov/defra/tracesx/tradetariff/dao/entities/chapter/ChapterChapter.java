package uk.gov.defra.tracesx.tradetariff.dao.entities.chapter;

import java.util.List;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;

public class ChapterChapter {

  private int goods_nomenclature_sid;
  private String goods_nomenclature_item_id;
  private String description;
  private String formatted_description;
  private ChapterSection section;
  private int chapter_note_id;
  private int section_id;
  private String chapter_note;
  private List<ChapterHeading> headings;
  private ResponseInfo _response_info;

  public ChapterChapter() {
  }

  public int getGoods_nomenclature_sid() {
    return goods_nomenclature_sid;
  }

  public void setGoods_nomenclature_sid(int goods_nomenclature_sid) {
    this.goods_nomenclature_sid = goods_nomenclature_sid;
  }

  public String getGoods_nomenclature_item_id() {
    return goods_nomenclature_item_id;
  }

  public void setGoods_nomenclature_item_id(String goods_nomenclature_item_id) {
    this.goods_nomenclature_item_id = goods_nomenclature_item_id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  public ChapterSection getSection() {
    return section;
  }

  public void setSection(ChapterSection section) {
    this.section = section;
  }

  public int getChapter_note_id() {
    return chapter_note_id;
  }

  public void setChapter_note_id(int chapter_note_id) {
    this.chapter_note_id = chapter_note_id;
  }

  public int getSection_id() {
    return section_id;
  }

  public void setSection_id(int section_id) {
    this.section_id = section_id;
  }

  public String getChapter_note() {
    return chapter_note;
  }

  public void setChapter_note(String chapter_note) {
    this.chapter_note = chapter_note;
  }

  public List<ChapterHeading> getHeadings() {
    return headings;
  }

  public void setHeadings(List<ChapterHeading> headings) {
    this.headings = headings;
  }

  public ResponseInfo get_response_info() {
    return _response_info;
  }

  public void set_response_info(ResponseInfo _response_info) {
    this._response_info = _response_info;
  }

  @Override
  public String toString() {
    return "ChapterChapter{" + "goods_nomenclature_sid=" + goods_nomenclature_sid
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", description=" + description
            + ", formatted_description=" + formatted_description
            + ", section=" + section
            + ", chapter_note_id=" + chapter_note_id
            + ", section_id=" + section_id
            + ", chapter_note=" + chapter_note
            + ", headings=" + headings
            + ", _response_info=" + _response_info + '}';
  }
}