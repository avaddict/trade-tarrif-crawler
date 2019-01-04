package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import uk.gov.defra.tracesx.tradetariff.dao.entities.MeasureType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;

@JsonInclude(Include.NON_EMPTY)
public class Measure {

  private int id;
  private String origin;
  private String effective_start_date;
  private String effective_end_date;
  @JsonProperty("import")
  private boolean _import;
  private List<MeasureCondition> measure_conditions;
  private List<ExcludedCountry> excluded_countries;
  private List<Footnote> footnotes;
  private OrderNumber order_number;
  private boolean excise;
  private boolean vat;
  private MeasureType measure_type;
  private DutyExpression duty_expression;
  private LegalAct legal_act;
  private LegalAct suspension_legal_act;
  private GeographicalArea geographical_area;

  public Measure() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getEffective_start_date() {
    return effective_start_date;
  }

  public void setEffective_start_date(String effective_start_date) {
    this.effective_start_date = effective_start_date;
  }

  public String getEffective_end_date() {
    return effective_end_date;
  }

  public void setEffective_end_date(String effective_end_date) {
    this.effective_end_date = effective_end_date;
  }

  public boolean isImport() {
    return _import;
  }

  public void setImport(boolean _import) {
    this._import = _import;
  }

  public List<MeasureCondition> getMeasure_conditions() {
    return measure_conditions;
  }

  public void setMeasure_conditions(List<MeasureCondition> measure_conditions) {
    this.measure_conditions = measure_conditions;
  }

  public List<ExcludedCountry> getExcluded_countries() {
    return excluded_countries;
  }

  public void setExcluded_countries(List<ExcludedCountry> excluded_countries) {
    this.excluded_countries = excluded_countries;
  }

  public List<Footnote> getFootnotes() {
    return footnotes;
  }

  public void setFootnotes(List<Footnote> footnotes) {
    this.footnotes = footnotes;
  }

  public OrderNumber getOrder_number() {
    return order_number;
  }

  public void setOrder_number(OrderNumber order_number) {
    this.order_number = order_number;
  }

  public boolean isExcise() {
    return excise;
  }

  public void setExcise(boolean excise) {
    this.excise = excise;
  }

  public boolean isVat() {
    return vat;
  }

  public void setVat(boolean vat) {
    this.vat = vat;
  }

  public MeasureType getMeasure_type() {
    return measure_type;
  }

  public void setMeasure_type(MeasureType measure_type) {
    this.measure_type = measure_type;
  }

  public DutyExpression getDuty_expression() {
    return duty_expression;
  }

  public void setDuty_expression(DutyExpression duty_expression) {
    this.duty_expression = duty_expression;
  }

  public LegalAct getLegal_act() {
    return legal_act;
  }

  public void setLegal_act(LegalAct legal_act) {
    this.legal_act = legal_act;
  }

  public LegalAct getSuspension_legal_act() {
    return suspension_legal_act;
  }

  public void setSuspension_legal_act(LegalAct suspension_legal_act) {
    this.suspension_legal_act = suspension_legal_act;
  }

  public GeographicalArea getGeographical_area() {
    return geographical_area;
  }

  public void setGeographical_area(GeographicalArea geographical_area) {
    this.geographical_area = geographical_area;
  }

  @Override
  public String toString() {
    return "Measure{" + "id=" + id
            + ", origin=" + origin
            + ", effective_start_date=" + effective_start_date
            + ", effective_end_date=" + effective_end_date
            + ", _import=" + _import
            + ", measure_conditions=" + measure_conditions
            + ", excluded_countries=" + excluded_countries
            + ", footnotes=" + footnotes
            + ", order_number=" + order_number
            + ", excise=" + excise
            + ", vat=" + vat
            + ", measure_type=" + measure_type
            + ", duty_expression=" + duty_expression
            + ", legal_act=" + legal_act
            + ", suspension_legal_act=" + suspension_legal_act
            + ", geographical_area=" + geographical_area
            + '}';
  }
}