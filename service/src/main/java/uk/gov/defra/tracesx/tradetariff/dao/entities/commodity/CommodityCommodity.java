package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import java.util.List;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;

public class CommodityCommodity {

  private String producline_suffix;
  private String description;
  private int number_indents;
  private String goods_nomenclature_item_id;
  private String bti_url;
  private String formatted_description;
  private String description_plain;
  private String consigned_from;
  private String basic_duty_rate;
  private boolean meursing_code;
  private CommoditySection section;
  private CommodityChapter chapter;
  private boolean declarable;
  private List<Measure> import_measures;
  private List<Measure> export_measures;
  private List<Footnote> footnotes;
  private CommodityHeading heading;
  private List<Ancestor> ancestors;
  private ResponseInfo _response_info;

  public CommodityCommodity() {
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

  public String getDescription_plain() {
    return description_plain;
  }

  public void setDescription_plain(String description_plain) {
    this.description_plain = description_plain;
  }

  public String getConsigned_from() {
    return consigned_from;
  }

  public void setConsigned_from(String consigned_from) {
    this.consigned_from = consigned_from;
  }

  public String getBasic_duty_rate() {
    return basic_duty_rate;
  }

  public void setBasic_duty_rate(String basic_duty_rate) {
    this.basic_duty_rate = basic_duty_rate;
  }

  public boolean isMeursing_code() {
    return meursing_code;
  }

  public void setMeursing_code(boolean meursing_code) {
    this.meursing_code = meursing_code;
  }

  public CommoditySection getSection() {
    return section;
  }

  public void setSection(CommoditySection section) {
    this.section = section;
  }

  public CommodityChapter getChapter() {
    return chapter;
  }

  public void setChapter(CommodityChapter chapter) {
    this.chapter = chapter;
  }

  public boolean isDeclarable() {
    return declarable;
  }

  public void setDeclarable(boolean declarable) {
    this.declarable = declarable;
  }

  public List<Measure> getImport_measures() {
    return import_measures;
  }

  public void setImport_measures(List<Measure> import_measures) {
    this.import_measures = import_measures;
  }

  public List<Measure> getExport_measures() {
    return export_measures;
  }

  public void setExport_measures(List<Measure> export_measures) {
    this.export_measures = export_measures;
  }

  public List<Footnote> getFootnotes() {
    return footnotes;
  }

  public void setFootnotes(List<Footnote> footnotes) {
    this.footnotes = footnotes;
  }

  public CommodityHeading getHeading() {
    return heading;
  }

  public void setHeading(CommodityHeading heading) {
    this.heading = heading;
  }

  public List<Ancestor> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<Ancestor> ancestors) {
    this.ancestors = ancestors;
  }

  public ResponseInfo get_response_info() {
    return _response_info;
  }

  public void set_response_info(ResponseInfo _response_info) {
    this._response_info = _response_info;
  }

  @Override
  public String toString() {
    return "CommodityCommodity{" + "producline_suffix=" + producline_suffix
            + ", description=" + description
            + ", number_indents=" + number_indents
            + ", goods_nomenclature_item_id=" + goods_nomenclature_item_id
            + ", bti_url=" + bti_url
            + ", formatted_description=" + formatted_description
            + ", description_plain=" + description_plain
            + ", consigned_from=" + consigned_from
            + ", basic_duty_rate=" + basic_duty_rate
            + ", meursing_code=" + meursing_code
            + ", section=" + section
            + ", chapter=" + chapter
            + ", declarable=" + declarable
            + ", import_measures=" + import_measures
            + ", export_measures=" + export_measures
            + ", footnotes=" + footnotes
            + ", heading=" + heading
            + ", ancestors=" + ancestors
            + ", _response_info=" + _response_info + '}';
  }
}