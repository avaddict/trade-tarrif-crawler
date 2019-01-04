package uk.gov.defra.tracesx.tradetariff.dao.entities.heading;

import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingChapter;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingHeading;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingCommodity;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;
import static org.junit.Assert.*;

public class HeadingHeadingTest {
  
  private static final String HEADINGS_GOODS_NOMENCLATURE_ITEM_ID = "0102000000";
  private static final String HEADINGS_DESCRIPTION = "Live bovine animals";
  private static final String HEADINGS_BTI_URL = "http://ec.europa.eu/taxation_customs";
  private static final String HEADINGS_FORMATTED_DESCRIPTION = "Live bovine animals";
  private static final String FOOTNOTE_CODE = "TN701";
  private static final String FOOTNOTE_CODE2 = "TN702";
  private static final String CHAPTER_DESCRIPTION = "LIVE ANIMALS";
  private static final String SECTION_NUMERAL = "IV";
  private static final int COMMODITY_GOODS_NOMENCLATURE_SID = 94053;
  private static final int COMMODITY_GOODS_NOMENCLATURE_SID2 = 94047;
  private static final String RESPONSE_INFO_REL = "self";
  private static final String RESPONSE_INFO_REL2 = "section";
    
  public HeadingHeadingTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void verifyHeadingsGoods_nomenclature_item_idProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    
    //When
    headings.setGoods_nomenclature_item_id(HEADINGS_GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(HEADINGS_GOODS_NOMENCLATURE_ITEM_ID, headings.getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyHeadingsDescriptionProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    
    //When
    headings.setDescription(HEADINGS_DESCRIPTION);

    //Then
    assertEquals(HEADINGS_DESCRIPTION, headings.getDescription());    
  }

  @Test
  public void verifyHeadingsBti_urlProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    
    //When
    headings.setBti_url(HEADINGS_BTI_URL);

    //Then
    assertEquals(HEADINGS_BTI_URL, headings.getBti_url());    
  }

  @Test
  public void verifyHeadingsFormatted_descriptionProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    
    //When
    headings.setFormatted_description(HEADINGS_FORMATTED_DESCRIPTION);

    //Then
    assertEquals(HEADINGS_FORMATTED_DESCRIPTION, headings.getFormatted_description());
  }
  
  @Test
  public void verifyHeadingsFootnoteProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    Footnote footnote1 = new Footnote();
    Footnote footnote2 = new Footnote();
    footnote1.setCode(FOOTNOTE_CODE);
    footnote2.setCode(FOOTNOTE_CODE2);
    List<Footnote> footnoteList = Arrays.asList(footnote1, footnote2);
  
    //When
    headings.setFootnotes(footnoteList);

    //
    assertEquals(2, headings.getFootnotes().size());
    assertEquals(FOOTNOTE_CODE, headings.getFootnotes().get(0).getCode());
    assertEquals(FOOTNOTE_CODE2, headings.getFootnotes().get(1).getCode());
  }
  
  @Test
  public void verifyHeadingsChapterProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    HeadingChapter chapter = new HeadingChapter();
    chapter.setDescription(CHAPTER_DESCRIPTION);
            
    //When
    headings.setChapter(chapter);
    
    //Then
    assertEquals(CHAPTER_DESCRIPTION, headings.getChapter().getDescription());
  }

  @Test
  public void verifyHeadingsSectionProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    HeadingSection section = new HeadingSection();
    section.setNumeral(SECTION_NUMERAL);
            
    //When
    headings.setSection(section);

    //Then
    assertEquals(SECTION_NUMERAL, headings.getSection().getNumeral());
  }

  @Test
  public void verifyHeadingsCommoditiesProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    HeadingCommodity commodity1 = new HeadingCommodity();
    HeadingCommodity commodity2 = new HeadingCommodity();
    commodity1.setGoods_nomenclature_sid(COMMODITY_GOODS_NOMENCLATURE_SID);
    commodity2.setGoods_nomenclature_sid(COMMODITY_GOODS_NOMENCLATURE_SID2);
    List<HeadingCommodity> commodityList = Arrays.asList(commodity1, commodity2);

    //When
    headings.setCommodities(commodityList);

    //Then
    assertEquals(2, headings.getCommodities().size());
    assertEquals(COMMODITY_GOODS_NOMENCLATURE_SID,
            headings.getCommodities().get(0).getGoods_nomenclature_sid());
    assertEquals(COMMODITY_GOODS_NOMENCLATURE_SID2,
            headings.getCommodities().get(1).getGoods_nomenclature_sid());
  }

  @Test
  public void verifyHeadingsResponse_infoProperty() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    Link link1 = new Link();
    link1.setRel(RESPONSE_INFO_REL);
    Link link2 = new Link();
    link2.setRel(RESPONSE_INFO_REL2);
    List<Link> links = new ArrayList(Arrays.asList(link1, link2));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);

    //When
    headings.set_response_info(responseInfo);
      
    //Then
    assertEquals(2, headings.get_response_info().getLinks().size());
    assertEquals(RESPONSE_INFO_REL,
            headings.get_response_info().getLinks().get(0).getRel());
    assertEquals(RESPONSE_INFO_REL2,
            headings.get_response_info().getLinks().get(1).getRel());
  }

  @Test
  public void verifyHeadingsToString() {
    //Given
    HeadingHeading headings = new HeadingHeading();
    Footnote footnote1 = new Footnote();
    Footnote footnote2 = new Footnote();
    footnote1.setCode(FOOTNOTE_CODE);
    footnote2.setCode(FOOTNOTE_CODE2);
    List<Footnote> footnoteList = Arrays.asList(footnote1, footnote2);
    HeadingChapter chapter = new HeadingChapter();
    chapter.setDescription(CHAPTER_DESCRIPTION);
    HeadingSection section = new HeadingSection();
    section.setNumeral(SECTION_NUMERAL);
    HeadingCommodity commodity1 = new HeadingCommodity();
    HeadingCommodity commodity2 = new HeadingCommodity();
    commodity1.setGoods_nomenclature_sid(COMMODITY_GOODS_NOMENCLATURE_SID);
    commodity2.setGoods_nomenclature_sid(COMMODITY_GOODS_NOMENCLATURE_SID2);
    List<HeadingCommodity> commoditiesList =
            new ArrayList(Arrays.asList(commodity1, commodity2));
    Link link1 = new Link();
    link1.setRel(RESPONSE_INFO_REL);
    Link link2 = new Link();
    link1.setRel(RESPONSE_INFO_REL2);
    List<Link> links = new ArrayList(Arrays.asList(link1, link2));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);
    String expResult =
        "HeadingHeading{" + 
            "goods_nomenclature_item_id=" + HEADINGS_GOODS_NOMENCLATURE_ITEM_ID + 
            ", description=" + HEADINGS_DESCRIPTION + 
            ", bti_url=" + HEADINGS_BTI_URL + 
            ", formatted_description=" + HEADINGS_FORMATTED_DESCRIPTION + 
            ", footnotes=" + footnoteList + 
            ", chapter=" + chapter + 
            ", section=" + section + 
            ", commodities=" + commoditiesList + 
            ", _response_info=" + responseInfo + '}';

    //When
    headings.setGoods_nomenclature_item_id(HEADINGS_GOODS_NOMENCLATURE_ITEM_ID);
    headings.setDescription(HEADINGS_DESCRIPTION);
    headings.setBti_url(HEADINGS_BTI_URL);
    headings.setFormatted_description(HEADINGS_FORMATTED_DESCRIPTION);
    headings.setFootnotes(footnoteList);
    headings.setChapter(chapter);
    headings.setSection(section);
    headings.setCommodities(commoditiesList);
    headings.set_response_info(responseInfo);
    
    //Then
    assertEquals(expResult, headings.toString());
  }

}
