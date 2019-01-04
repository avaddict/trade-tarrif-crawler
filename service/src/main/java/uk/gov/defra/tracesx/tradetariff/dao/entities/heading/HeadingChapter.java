package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

public class HeadingChapter {

  private String goods_nomenclature_item_id;
  private String description;
  private String formatted_description;
  private String chapter_note;

  public HeadingChapter() {
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

  public String getChapter_note() {
    return chapter_note;
  }

  public void setChapter_note(String chapter_note) {
    this.chapter_note = chapter_note;
  }

  @Override
  public String toString() {
    return "HeadingChapter{"
            + "goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", description=" + description
            + ", formatted_description=" + formatted_description
            + ", chapter_note=" + chapter_note + '}';
  }
}
