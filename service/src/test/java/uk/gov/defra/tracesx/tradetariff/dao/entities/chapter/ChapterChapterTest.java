package uk.gov.defra.tracesx.tradetariff.dao.entities.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;


public class ChapterChapterTest {
  
  public ChapterChapterTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  private static final int GOODS_NOMENCLATURE_SID = 27809;
  private static final String GOODS_NOMENCLATURE_ITEM_ID = "0200000000";
  private static final String DESCRIPTION = "MEAT AND EDIBLE MEAT OFFAL";
  private static final String FORMATTED_DESCRIPTION = "Meat and edible meat offal";
  
  private static final int CHAPTER_NOTE_ID = 47;
  private static final int SECTION_ID = 2;
  private static final String CHAPTER_NOTE = "* 1\\.This chapter does not cover:";
  
  private static final int HEADING_GOODS_NOMENCLATURE_SID = 27810;
  private static final int HEADING_GOODS_NOMENCLATURE_SID2 = 27885;

  private static final String RESPONSE_INFO_HREF = "/trade-tariff/chapters/02.json";
  private static final String RESPONSE_INFO_HREF2 = "/trade-tariff/sections/1";

  @Test
  public void verifyGoods_nomenclature_sidProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_SID, chapter.getGoods_nomenclature_sid());
  }

  @Test
  public void verifyGoods_nomenclature_item_idProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);

    //Then
    assertEquals(GOODS_NOMENCLATURE_ITEM_ID, chapter.getGoods_nomenclature_item_id());
  }

  @Test
  public void verifyDescriptionProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setDescription(DESCRIPTION);

    //Then
    assertEquals(DESCRIPTION, chapter.getDescription());
  }

  @Test
  public void verifyFormatted_descriptionProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);

    //Then
    assertEquals(FORMATTED_DESCRIPTION, chapter.getFormatted_description());
  }

  @Test
  public void verifySectionProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();
    ChapterSection section = new ChapterSection();

    //When
    section.setId(SECTION_ID);
    chapter.setSection(section);
    
    //Then
   assertEquals(SECTION_ID, chapter.getSection().getId());
  }
  
  @Test
  public void verifyChapter_note_idProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setChapter_note_id(CHAPTER_NOTE_ID);

    //Then
    assertEquals(CHAPTER_NOTE_ID, chapter.getChapter_note_id());
  }

  @Test
  public void verifySection_idProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setSection_id(SECTION_ID);

    //Then
    assertEquals(SECTION_ID, chapter.getSection_id());
  }

  @Test
  public void verifyChapter_noteProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();

    //When
    chapter.setChapter_note(CHAPTER_NOTE);

    //Then
    assertEquals(CHAPTER_NOTE, chapter.getChapter_note());
  }

  @Test
  public void verifyHeadingsProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();
    ChapterHeading heading = new ChapterHeading();
    ChapterHeading heading2 = new ChapterHeading();
    List<ChapterHeading> headings = Arrays.asList(heading, heading2);
    Children child = new Children();
    Children child2 = new Children();
    List<Children> children = Arrays.asList(child);
    List<Children> children2 = Arrays.asList(child2);

    //When
    heading.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID);
    heading.setChildren(children);
    heading2.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID2);
    heading2.setChildren(children2);  
    chapter.setHeadings(headings);
    
    //Then
   assertEquals(HEADING_GOODS_NOMENCLATURE_SID,
           chapter.getHeadings().get(0).getGoods_nomenclature_sid());
   assertEquals(1, chapter.getHeadings().get(0).getChildren().size());
   assertEquals(HEADING_GOODS_NOMENCLATURE_SID2,
           chapter.getHeadings().get(1).getGoods_nomenclature_sid());
   assertEquals(1, chapter.getHeadings().get(1).getChildren().size());
  }

  @Test
  public void verifyResponse_infoProperty() {
    //Given
    ChapterChapter chapter = new ChapterChapter();
    Link link = new Link();
    Link link2 = new Link();
    List<Link> links = new ArrayList(Arrays.asList(link, link2));
    ResponseInfo responseInfo = new ResponseInfo();

    //When
    link2.setHref(RESPONSE_INFO_HREF2);
    responseInfo.setLinks(links);
    link.setHref(RESPONSE_INFO_HREF);
    chapter.set_response_info(responseInfo);

    //Then
    assertEquals(2, chapter.get_response_info().getLinks().size());
    assertEquals(RESPONSE_INFO_HREF, chapter.get_response_info().getLinks().get(0).getHref());
    assertEquals(RESPONSE_INFO_HREF2, chapter.get_response_info().getLinks().get(1).getHref());
  }
  
  @Test
  public void verifyToString() {
    //Given
    ChapterChapter chapter = new ChapterChapter();
    ChapterSection section = new ChapterSection();
    section.setId(SECTION_ID);
    Children child = new Children();
    Children child2 = new Children();
    List<Children> children = Arrays.asList(child);
    List<Children> children2 = Arrays.asList(child2);
    ChapterHeading heading = new ChapterHeading();
    ChapterHeading heading2 = new ChapterHeading();
    heading.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID);
    heading.setChildren(children);
    heading2.setGoods_nomenclature_sid(HEADING_GOODS_NOMENCLATURE_SID2);
    heading2.setChildren(children2);  
    List<ChapterHeading> headings = Arrays.asList(heading, heading2);
    Link link = new Link();
    Link link2 = new Link();
    link.setHref(RESPONSE_INFO_HREF);
    link2.setHref(RESPONSE_INFO_HREF2);
    List<Link> links = new ArrayList(Arrays.asList(link, link2));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);

    String expResult = "ChapterChapter{" + "goods_nomenclature_sid=" + GOODS_NOMENCLATURE_SID
            + ", goods_nomenclature_item_id=" + GOODS_NOMENCLATURE_ITEM_ID
            + ", description=" + DESCRIPTION
            + ", formatted_description=" + FORMATTED_DESCRIPTION
            + ", section=" + section.toString()
            + ", chapter_note_id=" + CHAPTER_NOTE_ID
            + ", section_id=" + SECTION_ID
            + ", chapter_note=" + CHAPTER_NOTE
            + ", headings=" + headings.toString()
            + ", _response_info=" + responseInfo.toString() + '}';

    //When
    chapter.setGoods_nomenclature_sid(GOODS_NOMENCLATURE_SID);
    chapter.setGoods_nomenclature_item_id(GOODS_NOMENCLATURE_ITEM_ID);
    chapter.setDescription(DESCRIPTION);
    chapter.setFormatted_description(FORMATTED_DESCRIPTION);
    chapter.setSection(section);
    chapter.setChapter_note_id(CHAPTER_NOTE_ID);
    chapter.setSection_id(SECTION_ID);
    chapter.setChapter_note(CHAPTER_NOTE);
    chapter.setHeadings(headings);
    chapter.set_response_info(responseInfo);
    
    //Then
    assertEquals(expResult, chapter.toString());
  }

}