package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

public class OverviewMeasure {
  
  private int id;
  private boolean vat;
  MeasureType measure_type;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isVat() {
    return vat;
  }

  public void setVat(boolean vat) {
    this.vat = vat;
  }

  
  /*
  overview_measures": [{
			"id": -405880,
			"vat": true,
			"measure_type": {
				"id": "VTS",
				"description": "VAT standard rate"
			},
			"duty_expression": 
*/
}
