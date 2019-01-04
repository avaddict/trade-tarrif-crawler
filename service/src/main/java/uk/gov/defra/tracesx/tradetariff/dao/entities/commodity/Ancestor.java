package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class Ancestor {

  private String producline_suffix;
  private String description;
  private int number_indents;
  private String goods_nomenclature_item_id;
  private String formatted_description;
  private String description_plain;

  public Ancestor() {
  }

  public String getProducline_suffix() {
    return producline_suffix;
  }

  public void setProducline_suffix(String producline_suffix) {
    this.producline_suffix = producline_suffix;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getNumber_indents() {
    return number_indents;
  }

  public void setNumber_indents(int number_indents) {
    this.number_indents = number_indents;
  }

  public String getGoods_nomenclature_item_id() {
    return goods_nomenclature_item_id;
  }

  public void setGoods_nomenclature_item_id(String goods_nomenclature_item_id) {
    this.goods_nomenclature_item_id = goods_nomenclature_item_id;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  public String getDescription_plain() {
    return description_plain;
  }

  public void setDescription_plain(String description_plain) {
    this.description_plain = description_plain;
  }

  @Override
  public String toString() {
    return "Ancestor{" + "producline_suffix=" + producline_suffix
            + ", description=" + description
            + ", number_indents=" + number_indents
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", formatted_description=" + formatted_description
            + ", description_plain=" + description_plain + '}';
  }

}