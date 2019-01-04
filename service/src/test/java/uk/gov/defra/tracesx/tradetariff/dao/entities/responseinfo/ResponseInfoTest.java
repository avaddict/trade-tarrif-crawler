package uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo;

import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.ResponseInfo;
import uk.gov.defra.tracesx.tradetariff.dao.entities.responseinfo.Link;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author howardk
 */
public class ResponseInfoTest {
    private static final String HREF_1 = "href1";
    private static final String HREF_2 = "/href2";

    private ResponseInfo responseInfo;
    private Link link1;
    private Link link2;
    private List<Link> links;
    
    public ResponseInfoTest() {
    }
    
    @Before
    public void setUp() {
        //Given
        responseInfo = new ResponseInfo();
        link1 = new Link();
        link1.setHref(HREF_1);
        link2 = new Link();
        link2.setHref(HREF_2);
        links = new ArrayList(Arrays.asList(link1, link2));
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void VerifyLinksProperty() {
        //When
        responseInfo.setLinks(links);
        
        //Then
        List<Link> result = responseInfo.getLinks();
        assertEquals(2, result.size());
        assertEquals(HREF_1, result.get(0).getHref());
        assertEquals(HREF_2, result.get(1).getHref());
     }

    @Test
    public void testToString() {
        //Given
        String expResult = "ResponseInfo{" + "links=" + links.toString() + "}";       

        //When
        responseInfo.setLinks(links);

        //Then
        assertEquals(expResult, responseInfo.toString());
    }
    
}
