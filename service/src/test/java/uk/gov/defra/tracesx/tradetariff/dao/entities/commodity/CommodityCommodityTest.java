package uk.gov.defra.tracesx.tradetariff.dao.entities.commodity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import uk.gov.defra.tracesx.tradetariff.dao.entities.Footnote;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;

public class CommodityCommodityTest {

  public CommodityCommodityTest() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  private static final String PRODUCLINE_SUFFIX = "80";
  private static final String DESCRIPTION = "Meat of bovine animals, fresh or chilled";
  private static final int NUMBER_INDENTS = 2;
  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0102211000";
  private static final String BTI_URL = "http://ec.europa.eu/taxation_customs/dds2/ebti/ebti_consultation.jsp?Lang=en&nomenc=0102211000&Expand=true";
  private static final String FORMATTED_DESCRIPTION = "Meat of bovine animals, fresh or chilled - formatted";
  private static final String DESCRIPTION_PLAIN = "Meat of bovine animals, fresh or chilled - plain";
  private static final String CONSIGNED_FROM = "AD";
  private static final String BASIC_DUTY_RATE = "<span title=' EUR'>7.70</span> %";
  private static final boolean MEURSING_CODE = false;
  private static final boolean DECLARABLE = true;
  private static final String SECTION_TITLE = "Live animals; animal products";
  private static final String CHAPTER_GOODS_NOMENCLATURE_ITEM_ID = "0200000000";
  private static final int IMPORT_MEASURE_ID = -471014;
  private static final int IMPORT_MEASURE_ID2 = -471010;
  private static final String GENERATING_REGULATION_CODE = "R0160/17";
  private static final String GENERATING_REGULATION_CODE2 = "R0160/18";
  private static final String FOOTNOTE_CODE = "TN701";
  private static final String FOOTNOTE_CODE2 = "TN702";
  private static final String HEADING_GOODS_NOMENCLATURE_ITEM_ID = "0203000000";
  private static final String ANCESTOR_PRODUCLINE_SUFFIX = "10";
  private static final String ANCESTOR_PRODUCLINE_SUFFIX2 = "20";
  private static final String RESPONSE_INFO_REL = "self";

  @Test
  public void verifyProducline_suffixProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setProducline_suffix(PRODUCLINE_SUFFIX);

    //Then
    assertEquals(PRODUCLINE_SUFFIX, commodity.getProducline_suffix());
  }

  @Test
  public void verifyDescriptionProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, commodity.getDescription());
  }

  @Test
  public void verifyNumber_indentsProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setNumber_indents(NUMBER_INDENTS);

    //Then
    assertEquals(NUMBER_INDENTS, commodity.getNumber_indents());
  }

  @Test
  public void verifyGoods_nomenclature_item_idProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, commodity.getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyBti_urlProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setBti_url(BTI_URL);

    //Then
    assertEquals(BTI_URL, commodity.getBti_url());
  }

  @Test
  public void verifyFormatted_descriptionProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, commodity.getFormatted_description());
  }

  @Test
  public void verifyDescription_plainProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setDescription_plain(DESCRIPTION_PLAIN);

    //Then
    assertEquals(DESCRIPTION_PLAIN, commodity.getDescription_plain());
  }

  @Test
  public void verifyConsigned_fromProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setConsigned_from(CONSIGNED_FROM);

    //Then
    assertEquals(CONSIGNED_FROM, commodity.getConsigned_from());
  }

  @Test
  public void verifyBasic_duty_rateProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setBasic_duty_rate(BASIC_DUTY_RATE);

    //Then
    assertEquals(BASIC_DUTY_RATE, commodity.getBasic_duty_rate());
  }

  @Test
  public void verifyMeursing_codeProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setMeursing_code(MEURSING_CODE);

    //Then
    assertEquals(MEURSING_CODE, commodity.isMeursing_code());
  }

  @Test
  public void verifySectionProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    CommoditySection section = new CommoditySection();
    section.setTitle(SECTION_TITLE);

    //When
    commodity.setSection(section);

    //Then
    assertEquals(SECTION_TITLE, commodity.getSection().getTitle());
  }

  @Test
  public void verifyChapterProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    CommodityChapter chapter = new CommodityChapter();
    chapter.setGoods_nomenclature_item_id(CHAPTER_GOODS_NOMENCLATURE_ITEM_ID);

    //When
    commodity.setChapter(chapter);

    //Then
    assertEquals(CHAPTER_GOODS_NOMENCLATURE_ITEM_ID,
            commodity.getChapter().getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyDeclarableProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();

    //When
    commodity.setDeclarable(DECLARABLE);

    //Then
    assertEquals(DECLARABLE, commodity.isDeclarable());
  }

  @Test
  public void verifyImportMeasuresProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    Measure importMeasure = new Measure();
    Measure importMeasure2 = new Measure();
    importMeasure.setId(IMPORT_MEASURE_ID);
    importMeasure2.setId(IMPORT_MEASURE_ID2);
    List<Measure> importMeasures = Arrays.asList(importMeasure, importMeasure2);

    //When
    commodity.setImport_measures(importMeasures);

    //Then
    assertEquals(2, commodity.getImport_measures().size());
    assertEquals(IMPORT_MEASURE_ID, commodity.getImport_measures().get(0).getId());
    assertEquals(IMPORT_MEASURE_ID2, commodity.getImport_measures().get(1).getId());
  }

  @Test
  public void verifyExportMeasuresProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    Measure exportMeasure = new Measure();
    Measure exportMeasure2 = new Measure();
    LegalAct legalAct = new LegalAct();
    LegalAct legalAct2 = new LegalAct();
    legalAct.setGenerating_regulation_code(GENERATING_REGULATION_CODE);
    legalAct2.setGenerating_regulation_code(GENERATING_REGULATION_CODE2);
    exportMeasure.setLegal_act(legalAct);
    exportMeasure2.setLegal_act(legalAct2);
    List<Measure> exportMeasures = Arrays.asList(exportMeasure, exportMeasure2);

    //When
    commodity.setExport_measures(exportMeasures);

    //Then
    assertEquals(2, commodity.getExport_measures().size());
    assertEquals(GENERATING_REGULATION_CODE,
            commodity.getExport_measures().get(0).getLegal_act().getGenerating_regulation_code());
    assertEquals(GENERATING_REGULATION_CODE2,
            commodity.getExport_measures().get(1).getLegal_act().getGenerating_regulation_code());
  }

  @Test
  public void verifyFootnotesProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    Footnote footnote = new Footnote();
    Footnote footnote2 = new Footnote();
    footnote.setCode(FOOTNOTE_CODE);
    footnote2.setCode(FOOTNOTE_CODE2);
    List<Footnote> footnoteList = Arrays.asList(footnote, footnote2);

    //When
    commodity.setFootnotes(footnoteList);

    //Then
    assertEquals(2, commodity.getFootnotes().size());
    assertEquals(FOOTNOTE_CODE,
            commodity.getFootnotes().get(0).getCode());
    assertEquals(FOOTNOTE_CODE2,
            commodity.getFootnotes().get(1).getCode());
  }

  @Test
  public void verifyHeadingProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    CommodityHeading heading = new CommodityHeading();
    heading.setGoods_nomenclature_item_id(HEADING_GOODS_NOMENCLATURE_ITEM_ID);

    //When
    commodity.setHeading(heading);

    //Then
    assertEquals(HEADING_GOODS_NOMENCLATURE_ITEM_ID, commodity.getHeading().getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyAncestorsProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    Ancestor ancestor = new Ancestor();
    Ancestor ancestor2 = new Ancestor();
    ancestor.setProducline_suffix(ANCESTOR_PRODUCLINE_SUFFIX);
    ancestor2.setProducline_suffix(ANCESTOR_PRODUCLINE_SUFFIX2);
    List<Ancestor> ancestorList = Arrays.asList(ancestor, ancestor2);

    //When
    commodity.setAncestors(ancestorList);

    //Then
    assertEquals(2, commodity.getAncestors().size());
    assertEquals(ANCESTOR_PRODUCLINE_SUFFIX, commodity.getAncestors().get(0).getProducline_suffix());
    assertEquals(ANCESTOR_PRODUCLINE_SUFFIX2, commodity.getAncestors().get(1).getProducline_suffix());
  }

  @Test
  public void verifyHeadingsResponse_infoProperty() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    Link link = new Link();
    link.setRel(RESPONSE_INFO_REL);
    List<Link> links = new ArrayList(Arrays.asList(link));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);

    //When
    commodity.set_response_info(responseInfo);

    //Then
    assertEquals(1, commodity.get_response_info().getLinks().size());
    assertEquals(RESPONSE_INFO_REL, commodity.get_response_info().getLinks().get(0).getRel());
  }

  @Test
  public void verifyToString() {
    //Given
    CommodityCommodity commodity = new CommodityCommodity();
    CommoditySection section = new CommoditySection();
    CommodityChapter chapter = new CommodityChapter();
    Measure import_measure = new Measure();
    Measure import_measure2 = new Measure();
    List<Measure> import_measures = Arrays.asList(import_measure, import_measure2);
    Measure export_measure = new Measure();
    Measure export_measure2 = new Measure();
    List<Measure> export_measures = Arrays.asList(export_measure, export_measure2);
    Footnote footnote = new Footnote();
    Footnote footnote2 = new Footnote();
    List<Footnote> footnotes = Arrays.asList(footnote, footnote2);
    CommodityHeading heading = new CommodityHeading();
    Ancestor ancestor = new Ancestor();
    Ancestor ancestor2 = new Ancestor();
    List<Ancestor> ancestors = Arrays.asList(ancestor, ancestor2);
    ResponseInfo response_info = new ResponseInfo();
    
    String expResult = "CommodityCommodity{" + "producline_suffix=" + PRODUCLINE_SUFFIX
            + ", description=" + DESCRIPTION
            + ", number_indents=" + NUMBER_INDENTS
            + ", goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID
            + ", bti_url=" + BTI_URL
            + ", formatted_description=" + FORMATTED_DESCRIPTION
            + ", description_plain=" + DESCRIPTION_PLAIN
            + ", consigned_from=" + CONSIGNED_FROM
            + ", basic_duty_rate=" + BASIC_DUTY_RATE
            + ", meursing_code=" + MEURSING_CODE
            + ", section=" + section
            + ", chapter=" + chapter
            + ", declarable=" + DECLARABLE
            + ", import_measures=" + import_measures
            + ", export_measures=" + export_measures
            + ", footnotes=" + footnotes
            + ", heading=" + heading
            + ", ancestors=" + ancestors
            + ", _response_info=" + response_info + '}';
    
    //When
    commodity.setProducline_suffix(PRODUCLINE_SUFFIX);
    commodity.setDescription(DESCRIPTION);
    commodity.setNumber_indents(NUMBER_INDENTS);
    commodity.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    commodity.setBti_url(BTI_URL);
    commodity.setFormatted_description(FORMATTED_DESCRIPTION);
    commodity.setDescription_plain(DESCRIPTION_PLAIN);
    commodity.setConsigned_from(CONSIGNED_FROM);
    commodity.setBasic_duty_rate(BASIC_DUTY_RATE);
    commodity.setMeursing_code(MEURSING_CODE);
    commodity.setSection(section);
    commodity.setChapter(chapter);
    commodity.setDeclarable(DECLARABLE);
    commodity.setImport_measures(import_measures);
    commodity.setExport_measures(export_measures);
    commodity.setFootnotes(footnotes);
    commodity.setHeading(heading);
    commodity.setAncestors(ancestors);
    commodity.set_response_info(response_info);
    
    //Then
    assertEquals(expResult, commodity.toString());
  }
}
