package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

import java.util.List;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;

public class HeadingHeading {
  
  private String goods_nomenclature_item_id;
  private String description;
  private String bti_url;
  private String formatted_description;
  private List<Footnote> footnotes;
  private HeadingChapter chapter;
  private HeadingSection section;
  private List<HeadingCommodity> commodities;
  private ResponseInfo _response_info;

  public HeadingHeading() {
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

  public String getBti_url() {
    return bti_url;
  }

  public void setBti_url(String bti_url) {
    this.bti_url = bti_url;
  }

  public String getFormatted_description() {
    return formatted_description;
  }

  public void setFormatted_description(String formatted_description) {
    this.formatted_description = formatted_description;
  }

  public List<Footnote> getFootnotes() {
    return footnotes;
  }

  public void setFootnotes(List<Footnote> footnotes) {
    this.footnotes = footnotes;
  }

  public HeadingChapter getChapter() {
    return chapter;
  }

  public void setChapter(HeadingChapter chapter) {
    this.chapter = chapter;
  }

  public HeadingSection getSection() {
    return section;
  }

  public void setSection(HeadingSection section) {
    this.section = section;
  }

  public List<HeadingCommodity> getCommodities() {
    return commodities;
  }

  public void setCommodities(List<HeadingCommodity> commodities) {
    this.commodities = commodities;
  }

  public ResponseInfo get_response_info() {
    return _response_info;
  }

  public void set_response_info(ResponseInfo _response_info) {
    this._response_info = _response_info;
  }

  @Override
  public String toString() {
    return "HeadingHeading{" + 
            "goods_nomenclature_item_id=" + goods_nomenclature_item_id + 
            ", description=" + description + 
            ", bti_url=" + bti_url + 
            ", formatted_description=" + formatted_description + 
            ", footnotes=" + footnotes + 
            ", chapter=" + chapter + 
            ", section=" + section + 
            ", commodities=" + commodities + 
            ", _response_info=" + _response_info + '}';
  } 
}