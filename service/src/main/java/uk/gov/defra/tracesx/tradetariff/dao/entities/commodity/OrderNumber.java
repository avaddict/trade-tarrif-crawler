package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

public class OrderNumber {

  private String number;
  private Definition definition;

public OrderNumber() {
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
  
  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }

  @Override
  public String toString() {
    return "OrderNumber{" + "number=" + number 
            + ", definition=" + definition + '}';
  }
  

}