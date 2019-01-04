package uk.gov.defra.tracesx.tradetariff.dao.entities.section;

public class SectionChapter {

  private String description;
  private String goods_nomenclature_item_id;
  private int goods_nomenclature_sid;
  private String headings_from;
  private String headings_to;
  private String formatted_description;
  private int chapter_note_id;

  public SectionChapter() {
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGoods_nomenclature_item_id() {
    return goods_nomenclature_item_id;
  }

  public void setGoods_nomenclature_item_id(String goods_nomenclature_item_id) {
    this.goods_nomenclature_item_id = goods_nomenclature_item_id;
  }

  public int getGoods_nomenclature_sid() {
    return goods_nomenclature_sid;
  }

  public void setGoods_nomenclature_sid(int goods_nomenclature_sid) {
    this.goods_nomenclature_sid = goods_nomenclature_sid;
  }

  public String getHeadings_from() {
    return headings_from;
  }

  public void setHeadings_from(String headings_from) {
    this.headings_from = headings_from;
  }

  public String getHeadings_to() {
    return headings_to;
  }

  public void setHeadings_to(String headings_to) {
    this.headings_to = headings_to;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  public int getChapter_note_id() {
    return chapter_note_id;
  }

  public void setChapter_note_id(int chapter_note_id) {
    this.chapter_note_id = chapter_note_id;
  }

  @Override
  public String toString() {
    return "SectionChapter{"
            + "description=" + description
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", goods_nomenclature_sid=" + goods_nomenclature_sid
            + ", headings_from=" + headings_from
            + ", headings_to=" + headings_to
            + ", formatted_description=" + formatted_description
            + ", chapter_note_id=" + chapter_note_id + '}';
  }
}