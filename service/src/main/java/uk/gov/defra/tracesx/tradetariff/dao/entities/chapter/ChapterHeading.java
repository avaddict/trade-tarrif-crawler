package uk.gov.defra.tracesx.tradetariff.dao.entities.chapter;

import java.util.List;

public class ChapterHeading {

  private int goods_nomenclature_sid;
  private String goods_nomenclature_item_id;
  private boolean declarable;
  private String description;
  private String producline_suffix;
  private boolean leaf;
  private String description_plain;
  private String formatted_description;
  private List<Children> children;

  public ChapterHeading() {
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

  public boolean isDeclarable() {
    return declarable;
  }

  public void setDeclarable(boolean declarable) {
    this.declarable = declarable;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getProducline_suffix() {
    return producline_suffix;
  }

  public void setProducline_suffix(String producline_suffix) {
    this.producline_suffix = producline_suffix;
  }

  public boolean isLeaf() {
    return leaf;
  }

  public void setLeaf(boolean leaf) {
    this.leaf = leaf;
  }

  public String getDescription_plain() {
    return description_plain;
  }

  public void setDescription_plain(String description_plain) {
    this.description_plain = description_plain;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  public List<Children> getChildren() {
    return children;
  }

  public void setChildren(List<Children> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "ChapterHeading{" + "goods_nomenclature_sid=" + goods_nomenclature_sid
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", declarable=" + declarable
            + ", description=" + description
            + ", producline_suffix=" + producline_suffix
            + ", leaf=" + leaf
            + ", description_plain=" + description_plain
            + ", formatted_description=" + formatted_description
            + ", children=" + children + '}';
  }

}
