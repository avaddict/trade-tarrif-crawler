package uk.gov.defra.tracesx.tradetariff.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashSet;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import uk.gov.defra.tracesx.tradetariff.dao.entities.RootSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.chapter.ChapterChapter;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingHeading;
import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.CommodityCommodity;

public class TradetariffClientTest {

  private static final String SCHEME = "http";
  private static final String HOST = "hostname";
  private static final String PORT = "1234";
  private static final String SECTION_PATH_ID = "1";
  private static final String CHAPTER_PATH_ID = "01";
  private static final String HEADING_PATH_ID = "0101";
  private static final String COMMODITY_PATH_ID = "0102211000";
  private static final String ROOT_SECTIONS_URI =
      SCHEME + "://" + HOST + ":" + PORT + "/trade-tariff/sections.json";
  private static final String FETCH_SECTION_URI =
      SCHEME + "://" + HOST + ":" + PORT + 
      "/trade-tariff/sections/" + SECTION_PATH_ID + ".json";
  private static final String FETCH_CHAPTER_URI =
      SCHEME + "://" + HOST + ":" + PORT + 
      "/trade-tariff/chapters/" + CHAPTER_PATH_ID + ".json";
  private static final String FETCH_HEADING_URI =
      SCHEME + "://" + HOST + ":" + PORT + 
      "/trade-tariff/headings/" + HEADING_PATH_ID + ".json";
  private static final String FETCH_COMMODITY_URI =
      SCHEME + "://" + HOST + ":" + PORT + 
      "/trade-tariff/commodities/" + COMMODITY_PATH_ID + ".json";
          
  private static final RootSection ROOT_SECTION_ONE = new RootSection();
  private static final RootSection ROOT_SECTION_TWO = new RootSection();
  private static final RootSection ROOT_SECTION_THREE = new RootSection();
  private static final int ROOT_SECTION_ONE_ID = 1;
  private static final int ROOT_SECTION_TWO_ID = 2;
  private static final int ROOT_SECTION_THREE_ID = 3;
  private static final List<RootSection> ROOT_SECTIONS =
      Arrays.asList(ROOT_SECTION_ONE, ROOT_SECTION_TWO, ROOT_SECTION_THREE);

  private static final SectionSection SECTION_SECTION = new SectionSection();
  private static final int SECTION_SECTION_ID = 1;

  private static final ChapterChapter CHAPTER_CHAPTER = new ChapterChapter();
  private static final String CHAPTER_GOODS_NOMENCLATURE_ITEM_ID = "0200000000";
  
  private static final HeadingHeading HEADING_HEADING = new HeadingHeading();
  private static final String HEADING_GOODS_NOMENCLATURE_ITEM_ID = "0202000000";
  
  private static final CommodityCommodity COMMODITY_COMMODITY = new CommodityCommodity();
  private static final String COMMODITY_GOODS_NOMENCLATURE_ITEM_ID = "0102211000";
  
  private static final String RESPONSE_BODY = "{}";
  private static final ResponseEntity<String> RESPONSE_ENTITY =
      new ResponseEntity<>(RESPONSE_BODY, HttpStatus.OK);

  private final HashSet<String> sectionSet = new HashSet(Arrays.asList(1));
  private final HashSet<String> chapterSet = new HashSet(Arrays.asList(01));
  private RestTemplate mockedRestTemplate;
  private ObjectMapper mockedObjectMapper;
  private TradetariffClient tradetarrifClient;
  private URI rootSectionsUri;
  private URI fetchSectionUri;
  private URI fetchChapterUri;
  private URI fetchHeadingUri;
  private URI fetchCommodityUri;
  private List<RootSection> rootSections;
  private SectionSection sectionSection;
  private ChapterChapter chapterChapter;
  private HeadingHeading headingHeading;
  private CommodityCommodity commodityCommodity;

  public TradetariffClientTest() {
  }
  
  @Before
  public void setUp() {
    ROOT_SECTION_ONE.setId(ROOT_SECTION_ONE_ID);
    ROOT_SECTION_TWO.setId(ROOT_SECTION_TWO_ID);
    ROOT_SECTION_THREE.setId(ROOT_SECTION_THREE_ID);
    SECTION_SECTION.setId(SECTION_SECTION_ID);
    CHAPTER_CHAPTER.setGoods_nomenclature_item_id(CHAPTER_GOODS_NOMENCLATURE_ITEM_ID);
    HEADING_HEADING.setGoods_nomenclature_item_id(HEADING_GOODS_NOMENCLATURE_ITEM_ID);
    COMMODITY_COMMODITY.setGoods_nomenclature_item_id(COMMODITY_GOODS_NOMENCLATURE_ITEM_ID);
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testGetSections() throws URISyntaxException, IOException {
    givenWeHaveATradeTariffClient();
    whenWeGetRootSections();
    thenWeExpectTheRootSectionsToBeRetrieved();
  }
  
  @Test
  public void testGetSection() throws URISyntaxException, IOException {
    givenWeHaveATradeTariffClient();
    whenWeGetASection();
    thenWeExpectTheSectionToBeRetrieved();
  }
  
  @Test
  public void testGetChapter() throws URISyntaxException, IOException {
    givenWeHaveATradeTariffClient();
    whenWeGetAChapter();
    thenWeExpectTheChapterToBeRetrieved();
  }
  
  @Test
  public void testGetHeading() throws Exception {
    givenWeHaveATradeTariffClient();
    whenWeGetAHeading();
    thenWeExpectTheHeadingToBeRetrieved();
  }

  @Test
  public void testGetCommodity() throws Exception {
    givenWeHaveATradeTariffClient();
    whenWeGetACommodity();
    thenWeExpectTheCommodityToBeRetrieved();
  }

  private void givenWeHaveATradeTariffClient() throws URISyntaxException {
    mockedRestTemplate = mock(RestTemplate.class);
    mockedObjectMapper = mock(ObjectMapper.class);
    tradetarrifClient =
        Mockito.spy(
            new TradetariffClient(mockedRestTemplate, mockedObjectMapper, sectionSet, chapterSet, SCHEME, HOST, PORT));
    rootSectionsUri = new URI(ROOT_SECTIONS_URI);
    fetchSectionUri = new URI(FETCH_SECTION_URI);
    fetchChapterUri = new URI(FETCH_CHAPTER_URI);
    fetchHeadingUri = new URI(FETCH_HEADING_URI);
    fetchCommodityUri = new URI(FETCH_COMMODITY_URI);
  }
  
  private void whenWeGetRootSections() throws IOException {
    when(mockedRestTemplate.exchange(rootSectionsUri, HttpMethod.GET, null, String.class))
        .thenReturn(RESPONSE_ENTITY);
    when(mockedObjectMapper.readValue(RESPONSE_BODY, new TypeReference<List<RootSection>>(){}))
        .thenReturn(ROOT_SECTIONS);
    doReturn(ROOT_SECTIONS).when(tradetarrifClient).getRootSections();
    rootSections = tradetarrifClient.getRootSections();
  }

  private void whenWeGetASection() throws IOException {
    when(mockedRestTemplate.exchange(fetchSectionUri, HttpMethod.GET, null, String.class))
        .thenReturn(RESPONSE_ENTITY);
    when(mockedObjectMapper.readValue(RESPONSE_BODY, SectionSection.class))
        .thenReturn(SECTION_SECTION);
    doReturn(SECTION_SECTION).when(tradetarrifClient).getSection(SECTION_PATH_ID);
    sectionSection = tradetarrifClient.getSection(SECTION_PATH_ID);
  }

  private void whenWeGetAChapter() throws IOException {
    when(mockedRestTemplate.exchange(fetchChapterUri, HttpMethod.GET, null, String.class))
        .thenReturn(RESPONSE_ENTITY);
    when(mockedObjectMapper.readValue(RESPONSE_BODY, ChapterChapter.class))
        .thenReturn(CHAPTER_CHAPTER);
    doReturn(CHAPTER_CHAPTER).when(tradetarrifClient).getChapter(CHAPTER_PATH_ID);
    chapterChapter = tradetarrifClient.getChapter(CHAPTER_PATH_ID);
  }

  private void whenWeGetAHeading() throws IOException {
    when(mockedRestTemplate.exchange(fetchHeadingUri, HttpMethod.GET, null, String.class))
        .thenReturn(RESPONSE_ENTITY);
    when(mockedObjectMapper.readValue(RESPONSE_BODY, HeadingHeading.class))
        .thenReturn(HEADING_HEADING);
    doReturn(HEADING_HEADING).when(tradetarrifClient).getHeading(HEADING_PATH_ID);
    headingHeading = tradetarrifClient.getHeading(HEADING_PATH_ID);
  }

  private void whenWeGetACommodity() throws IOException {
    when(mockedRestTemplate.exchange(fetchCommodityUri, HttpMethod.GET, null, String.class))
        .thenReturn(RESPONSE_ENTITY);
    when(mockedObjectMapper.readValue(RESPONSE_BODY, CommodityCommodity.class))
        .thenReturn(COMMODITY_COMMODITY);
    doReturn(COMMODITY_COMMODITY).when(tradetarrifClient).getCommodity(COMMODITY_PATH_ID);
    commodityCommodity = tradetarrifClient.getCommodity(COMMODITY_PATH_ID);
  }

  private void thenWeExpectTheRootSectionsToBeRetrieved() {
    assertThat(rootSections).contains(ROOT_SECTION_ONE);
    assertThat(rootSections).contains(ROOT_SECTION_TWO);
    assertThat(rootSections).contains(ROOT_SECTION_THREE);
  }

  private void thenWeExpectTheSectionToBeRetrieved() {
    assertThat(sectionSection).hasFieldOrPropertyWithValue("id", SECTION_SECTION_ID);
  }

  private void thenWeExpectTheChapterToBeRetrieved() {
    assertThat(chapterChapter).hasFieldOrPropertyWithValue(
            "goods_nomenclature_item_id", CHAPTER_GOODS_NOMENCLATURE_ITEM_ID);
  }

  private void thenWeExpectTheHeadingToBeRetrieved() {
    assertThat(headingHeading).hasFieldOrPropertyWithValue(
            "goods_nomenclature_item_id", HEADING_GOODS_NOMENCLATURE_ITEM_ID);
  }

  private void thenWeExpectTheCommodityToBeRetrieved() {
    assertThat(commodityCommodity).hasFieldOrPropertyWithValue(
            "goods_nomenclature_item_id", COMMODITY_GOODS_NOMENCLATURE_ITEM_ID);
  }

}

