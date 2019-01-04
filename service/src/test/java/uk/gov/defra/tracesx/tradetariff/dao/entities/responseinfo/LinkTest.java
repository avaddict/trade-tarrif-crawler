package uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo;

import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkTest {

  private static final String REL = "self";
  private static final String HREF = "/trade-tariff/chapters/01.json";

  public LinkTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void VerifyRelProperty() {
    //Given
    Link link = new Link();

    //When
    link.setRel(REL);

    //Then
    assertEquals(REL, link.getRel());
  }

  @Test
  public void VerifyHrefProperty() {
    //Given
    Link link = new Link();

    //When
    link.setHref(HREF);

    //Then
    assertEquals(HREF, link.getHref());
  }

  @Test
  public void testToString() {
    //Given
    Link link = new Link();
    String expResult = "Link{" + "rel=" + REL + ", href=" + HREF + '}';

    //When
    link.setRel(REL);
    link.setHref(HREF);

    //Then
    assertEquals(expResult, link.toString());
  }

}
