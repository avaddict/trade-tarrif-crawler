package uk.gov.defra.tracesx.tradetariff.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import uk.gov.defra.tracesx.tradetariff.dao.entities.chapter.ChapterChapter;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingHeading;
import uk.gov.defra.tracesx.tradetariff.dao.entities.RootSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.chapter.ChapterHeading;
import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.CommodityCommodity;
import uk.gov.defra.tracesx.tradetariff.dao.entities.commodity.Measure;
import uk.gov.defra.tracesx.tradetariff.dao.entities.heading.HeadingCommodity;
import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionChapter;
import uk.gov.defra.tracesx.tradetariff.dao.entities.tree.TreeNode;

@Service
public class TradetariffClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(TradetariffClient.class);

  private final RestTemplate tradetariffClientRestTemplate;
  private final ObjectMapper tradetariffClientObjectMapper;
  private final HashSet<String> sectionSet;
  private final HashSet<String> chapterSet;
  private final String tradetariffClientScheme;
  private final String tradetariffClientHost;
  private final String tradetariffClientPort;

  @Autowired
  public TradetariffClient(
          RestTemplate tradetariffClientRestTemplate,
          ObjectMapper tradetariffClientObjectMapper,
          HashSet<String> sectionSet,
          HashSet<String> chapterSet,
          @Value("${TRADETARIFF_CLIENT_SCHEME}") String tradetariffClientScheme,
          @Value("${TRADETARIFF_CLIENT_HOST}") String tradetariffClientHost,
          @Value("${TRADETARIFF_CLIENT_PORT}") String tradetariffClientPort) {
    this.tradetariffClientRestTemplate = tradetariffClientRestTemplate;
    this.tradetariffClientObjectMapper = tradetariffClientObjectMapper;
    this.sectionSet = sectionSet;
    this.chapterSet = chapterSet;
    this.tradetariffClientScheme = tradetariffClientScheme;
    this.tradetariffClientHost = tradetariffClientHost;
    this.tradetariffClientPort = tradetariffClientPort;
  }

  public List<RootSection> getRootSections() throws IOException {
    UriComponentsBuilder builder
            = UriComponentsBuilder.newInstance()
                    .scheme(tradetariffClientScheme)
                    .host(tradetariffClientHost)
                    .port(tradetariffClientPort)
                    .path("/trade-tariff/sections.json");
    URI uri = builder.build().encode().toUri();
    LOGGER.info("getSections {}", uri);
    String response
            = tradetariffClientRestTemplate
                    .exchange(uri, HttpMethod.GET, null, String.class)
                    .getBody();
    List<RootSection> rootSections = tradetariffClientObjectMapper.readValue(response,
            new TypeReference<List<RootSection>>() {
    });

    LOGGER.debug("received trade-tariff /sections response {}", rootSections);
    return rootSections;
  }

  public SectionSection getSection(String sectionID) throws IOException {
    UriComponentsBuilder builder
            = UriComponentsBuilder.newInstance()
                    .scheme(tradetariffClientScheme)
                    .host(tradetariffClientHost)
                    .port(tradetariffClientPort)
                    .path("/trade-tariff/sections")
                    .pathSegment(sectionID + ".json");
    URI uri = builder.build().encode().toUri();
    LOGGER.info("getSection {}", uri);
    String response
            = tradetariffClientRestTemplate
                    .exchange(uri, HttpMethod.GET, null, String.class)
                    .getBody();
    SectionSection section = tradetariffClientObjectMapper.readValue(response,
            SectionSection.class);
    LOGGER.debug("received trade-tariff /sections response {}", section);
    return section;
  }

  public ChapterChapter getChapter(String chapterID) throws IOException {
    UriComponentsBuilder builder
            = UriComponentsBuilder.newInstance()
                    .scheme(tradetariffClientScheme)
                    .host(tradetariffClientHost)
                    .port(tradetariffClientPort)
                    .path("/trade-tariff/chapters")
                    .pathSegment(chapterID + ".json");
    URI uri = builder.build().encode().toUri();
    LOGGER.info("getChapter {}", uri);
    String response
            = tradetariffClientRestTemplate
                    .exchange(uri, HttpMethod.GET, null, String.class)
                    .getBody();
    ChapterChapter chapter = tradetariffClientObjectMapper.readValue(response,
            ChapterChapter.class);
    LOGGER.debug("received trade-tariff /chapters response {}", chapter);
    return chapter;
  }

  public HeadingHeading getHeading(String chapterID) throws IOException {
    UriComponentsBuilder builder
            = UriComponentsBuilder.newInstance()
                    .scheme(tradetariffClientScheme)
                    .host(tradetariffClientHost)
                    .port(tradetariffClientPort)
                    .path("/trade-tariff/headings")
                    .pathSegment(chapterID + ".json");
    URI uri = builder.build().encode().toUri();
    LOGGER.info("getHeading {}", uri);
    String response
            = tradetariffClientRestTemplate
                    .exchange(uri, HttpMethod.GET, null, String.class)
                    .getBody();
    LOGGER.info("getHeading response {}", response);
    HeadingHeading heading = tradetariffClientObjectMapper.readValue(response,
            HeadingHeading.class);
    LOGGER.debug("received trade-tariff /headings response {}", heading);
    return heading;
  }

  public CommodityCommodity getCommodity(String commodityID) throws IOException {
    UriComponentsBuilder builder
            = UriComponentsBuilder.newInstance()
                    .scheme(tradetariffClientScheme)
                    .host(tradetariffClientHost)
                    .port(tradetariffClientPort)
                    .path("/trade-tariff/commodities")
                    .pathSegment(commodityID + ".json");
    URI uri = builder.build().encode().toUri();
    LOGGER.info("getCommodity {}", uri);
    String response
            = tradetariffClientRestTemplate
                    .exchange(uri, HttpMethod.GET, null, String.class)
                    .getBody();
    LOGGER.info("getCommodity response {}", response);
    CommodityCommodity commodity = tradetariffClientObjectMapper.readValue(response,
            CommodityCommodity.class);
    LOGGER.debug("**** received trade-tariff /commodities response {}", response);
    return commodity;
  }

  public List<TreeNode> getCommodityTree() throws Exception {
    List<TreeNode> commodityTree = new ArrayList<>();
    //RootSection
    List<RootSection> rootSections = getRootSections();
    for (RootSection rootSection : rootSections) {
      String rootSectionId = Integer.toString(rootSection.getId());
      if (sectionSet.contains(rootSectionId)) {
        //Section
        SectionSection section = getSection(rootSectionId);
        TreeNode sectionTreeNode = new TreeNode();
        sectionTreeNode.setLabel(rootSectionId);
        sectionTreeNode.setCommodityCode(section.getNumeral());
        sectionTreeNode.setDescription(section.getTitle());
        sectionTreeNode.setChildren(new ArrayList<>());
        commodityTree.add(sectionTreeNode);
        LOGGER.info("section {}", sectionTreeNode);

        for (SectionChapter sectionChapter : section.getChapters()) {
          String chapterId = sectionChapter.getGoods_nomenclature_item_id().substring(0, 2);
          if (chapterSet.contains(chapterId)) {
            //Chapter
            ChapterChapter chapter = getChapter(chapterId);
            TreeNode chapterTreeNode = new TreeNode();
            chapterTreeNode.setLabel(chapterId);
            chapterTreeNode.setCommodityCode(chapter.getGoods_nomenclature_item_id());
            chapterTreeNode.setDescription(chapter.getFormatted_description());
            chapterTreeNode.setParent(sectionTreeNode);
            chapterTreeNode.setChildren(new ArrayList<>());
            sectionTreeNode.getChildren().add(chapterTreeNode);
            LOGGER.info("chapter {}", chapterTreeNode);
            //Heading
            for (ChapterHeading chapterHeading : chapter.getHeadings()) {
              String headingId = chapterHeading.getGoods_nomenclature_item_id().substring(0, 4);
              HeadingHeading heading = getHeading(headingId);
              TreeNode headingTreeNode = new TreeNode();
              headingTreeNode.setLabel(headingId);
              headingTreeNode.setCommodityCode(heading.getGoods_nomenclature_item_id());
              headingTreeNode.setDescription(heading.getFormatted_description());
              headingTreeNode.setParent(chapterTreeNode);
              headingTreeNode.setChildren(new ArrayList<>());
              chapterTreeNode.getChildren().add(headingTreeNode);
              LOGGER.info("heading {}", headingTreeNode);
              //Commodity
              for (HeadingCommodity headingCommodity : heading.getCommodities()) {
                String commodityId = headingCommodity.getGoods_nomenclature_item_id();
                TreeNode commodityTreeNode = new TreeNode();
                commodityTreeNode.setLabel(commodityId);
                commodityTreeNode.setCommodityCode(commodityId);
                commodityTreeNode.setDescription(headingCommodity.getFormatted_description());
                commodityTreeNode.setIndents(headingCommodity.getNumber_indents());
                if (headingCommodity.isLeaf()) {
                  CommodityCommodity commodity = getCommodity(commodityId);
                  commodityTreeNode.setDeclarable(commodity.isDeclarable());
                  for (Measure importMeasure : commodity.getImport_measures()) {
                    if (importMeasure.getMeasure_type().getId().equals("719")) {
                      commodityTreeNode.setIUU(true);

                    boolean ced = importMeasure.getMeasure_type().getId().equals("CED");
                    boolean cvd = importMeasure.getMeasure_type().getId().equals("CVD");

                    commodityTreeNode.setCED(ced);
                    commodityTreeNode.setCVED(cvd);

                    TreeNode parentNode = headingTreeNode;
                    while (parentNode != null) {
                      parentNode.setCED(ced);
                      parentNode.setCVED(cvd);
                        parentNode = parentNode.getParent();
                      }
                    }
                  }
                }
                commodityTreeNode.setParent(headingTreeNode);
                commodityTreeNode.setChildren(new ArrayList<TreeNode>());
                headingTreeNode.getChildren().add(commodityTreeNode);
                LOGGER.info("commodity {}", commodityTreeNode);
              }
            }
          }
        }
      }
    }
    return commodityTree;
  }
}
