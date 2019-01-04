package uk.gov.defra.tracesx.tradetariff.dao.entities.section;

import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionChapter;
import uk.gov.defra.tracesx.tradetariff.dao.entities.section.SectionSection;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SectionSectionTest {
    
  private static final int ID = new Double(Math.random()).intValue();
  private static final int POSITION = new Double(Math.random()).intValue();
  private static final String TITLE = "A fancy title!";
  private static final String NUMERAL = "IV";
  private static final String CHAPTER_FROM = "4";
  private static final String CHAPTER_TO = "18";
  private static final String SECTION_NOTE = "Section note";
  private static final int CHAPTER_NOTE_ID1 = new Double(Math.random()).intValue();
  private static final int CHAPTER_NOTE_ID2 = new Double(Math.random()).intValue();
  private static final String RESPONSE_INFO_HREF_1 = "href1";
  private static final String RESPONSE_INFO_HREF_2 = "href2";

  public SectionSectionTest() {
  }
    
  @Before
  public void setUp() {
  }
    
  @After
  public void tearDown() {
  }

  @Test
  public void verifyIdProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setId(ID);

    //Then
    assertEquals(ID, section.getId());
  }

  @Test
  public void verifyPositionProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setPosition(POSITION);

    //Then
    assertEquals(POSITION, section.getPosition());    
  }
  
  @Test
  public void verifyTitleProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setTitle(TITLE);

    //Then
    assertEquals(TITLE, section.getTitle());
  }

  @Test
  public void verifyNumeralProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setNumeral(NUMERAL);

    //Then
    assertEquals(NUMERAL, section.getNumeral());
  }

  @Test
  public void verifyChapter_fromProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setChapter_from(CHAPTER_FROM);

    //Then
    assertEquals(CHAPTER_FROM, section.getChapter_from());
  }

  @Test
  public void verifyChapter_toProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setChapter_to(CHAPTER_TO);

    //Then
    assertEquals(CHAPTER_TO, section.getChapter_to());
  }

  @Test
  public void verifyChaptersProperty() {
    //Given
    SectionSection section  = new SectionSection();
    SectionChapter chapter1 = new SectionChapter();
    chapter1.setChapter_note_id(CHAPTER_NOTE_ID1);
    SectionChapter chapter2 = new SectionChapter();
    chapter2.setChapter_note_id(CHAPTER_NOTE_ID2);
    List<SectionChapter> chaptersList = Arrays.asList(chapter1, chapter2);

    //When
    section.setChapters(chaptersList);
      
    //Then
    assertEquals(2, section.getChapters().size());
    assertEquals(CHAPTER_NOTE_ID1, 
            section.getChapters().get(0).getChapter_note_id());
    assertEquals(CHAPTER_NOTE_ID2, 
            section.getChapters().get(1).getChapter_note_id());
  }


  @Test
  public void verifySection_noteProperty() {
    //Given
    SectionSection section  = new SectionSection();
    
    //When
    section.setSection_note(SECTION_NOTE);

    //Then
    assertEquals(SECTION_NOTE, section.getSection_note());
  }

  @Test
  public void verifyResponse_infoProperty() {
    //Given
    SectionSection section  = new SectionSection();
    Link link1 = new Link();
    link1.setHref(RESPONSE_INFO_HREF_1);
    Link link2 = new Link();
    link2.setHref(RESPONSE_INFO_HREF_2);
    List<Link> links = new ArrayList(Arrays.asList(link1, link2));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);

    //When
    section.set_response_info(responseInfo);
      
    //Then
    assertEquals(2, section.get_response_info().getLinks().size());
    assertEquals(RESPONSE_INFO_HREF_1, 
            section.get_response_info().getLinks().get(0).getHref());
    assertEquals(RESPONSE_INFO_HREF_2, 
            section.get_response_info().getLinks().get(1).getHref());
  }

  @Test
  public void verifyToString() {
    //Given
    SectionSection section  = new SectionSection();
    SectionChapter chapter1 = new SectionChapter();
    chapter1.setChapter_note_id(CHAPTER_NOTE_ID1);
    SectionChapter chapter2 = new SectionChapter();
    chapter2.setChapter_note_id(CHAPTER_NOTE_ID2);
    List<SectionChapter> chaptersList = Arrays.asList(chapter1, chapter2);
    Link link1 = new Link();
    link1.setHref(RESPONSE_INFO_HREF_1);
    Link link2 = new Link();
    link2.setHref(RESPONSE_INFO_HREF_2);
    List<Link> links = new ArrayList(Arrays.asList(link1, link2));
    ResponseInfo responseInfo = new ResponseInfo();
    responseInfo.setLinks(links);
    String expResult = "SectionSection{" + "id=" + ID 
            + ", position=" + POSITION
            + ", title=" + TITLE
            + ", numeral=" + NUMERAL
            + ", chapter_from=" + CHAPTER_FROM
            + ", chapter_to=" + CHAPTER_TO
            + ", chapters=" + chaptersList
            + ", section_note=" + SECTION_NOTE
            + ", _response_info=" + responseInfo + '}';

    //When
    section.setId(ID);
    section.setPosition(POSITION);
    section.setTitle(TITLE);
    section.setNumeral(NUMERAL);
    section.setChapter_from(CHAPTER_FROM);
    section.setChapter_to(CHAPTER_TO);
    section.setChapters(chaptersList);
    section.setSection_note(SECTION_NOTE);
    section.set_response_info(responseInfo);

    //Then
    assertEquals(expResult, section.toString());
  }
    
}
