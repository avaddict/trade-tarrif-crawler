package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

public class HeadingCommodity {

  private String description;
  private int number_indents;
  private String goods_nomenclature_item_id;
  private boolean leaf;
  private int goods_nomenclature_sid;
  private String formatted_description;
  private String description_plain;
  private String producline_suffix;
  private int parent_sid;
  private 

  public HeadingCommodity() {
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

  public boolean isLeaf() {
    return leaf;
  }

  public void setLeaf(boolean leaf) {
    this.leaf = leaf;
  }

  public int getGoods_nomenclature_sid() {
    return goods_nomenclature_sid;
  }

  public void setGoods_nomenclature_sid(int goods_nomenclature_sid) {
    this.goods_nomenclature_sid = goods_nomenclature_sid;
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

  public String getProducline_suffix() {
    return producline_suffix;
  }

  public void setProducline_suffix(String producline_suffix) {
    this.producline_suffix = producline_suffix;
  }

  public int getParent_sid() {
    return parent_sid;
  }

  public void setParent_sid(int parent_sid) {
    this.parent_sid = parent_sid;
  }

  @Override
  public String toString() {
    return "HeadingCommodity{" + "description=" + description
            + ", number_indents=" + number_indents
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", leaf=" + leaf
            + ", goods_nomenclature_sid=" + goods_nomenclature_sid
            + ", formatted_description=" + formatted_description
            + ", description_plain=" + description_plain
            + ", producline_suffix=" + producline_suffix
            + ", parent_sid=" + parent_sid + '}';
  }
}