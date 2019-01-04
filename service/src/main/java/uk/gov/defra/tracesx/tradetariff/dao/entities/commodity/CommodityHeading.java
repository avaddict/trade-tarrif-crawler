package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class CommodityHeading {

  private String goods_nomenclature_item_id;
  private String description;
  private String formatted_description;
  private String description_plain;

  public CommodityHeading() {
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

  public String getDescription_plain() {
    return description_plain;
  }

  public void setDescription_plain(String description_plain) {
    this.description_plain = description_plain;
  }

  @Override
  public String toString() {
    return "CommodityHeading{" + "goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", description=" + description
            + ", formatted_description=" + formatted_description
            + ", description_plain=" + description_plain + '}';
  }
}