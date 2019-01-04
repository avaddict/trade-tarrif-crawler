package uk.gov.defra.tracesx.tradetariff.dao.entities.tree;

import java.util.List;
import java.util.Arrays;
import org.assertj.core.util.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeNodeTest {
  
  private static final String LABEL = "01";
  private static final String COMMODITY_CODE = "010203";
  private static final String COMMODITY_CODE2 = "030201";
  private static final String DESCRIPTION = "Live Animals"; 
  private static final boolean DECLARABLE = true; 
  private static final boolean CED = true; 
  private static final boolean CVED = true; 
  private static final boolean IUU = true; 
  private static final int INDENTS = 4; 
  
  public TreeNodeTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void verifyLabelProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setLabel(LABEL);

    // Then
    assertEquals(LABEL, treeNode.getLabel());
  }

  @Test
  public void verifyParentProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    TreeNode parent = new TreeNode();
    parent.setCommodityCode(COMMODITY_CODE);
    
    // When
    treeNode.setParent(parent);

    // Then
    assertEquals(COMMODITY_CODE, treeNode.getParent().getCommodityCode());
  }

  @Test
  public void verifyDescriptionProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setDescription(DESCRIPTION);

    // Then
    assertEquals(DESCRIPTION, treeNode.getDescription());
  }

  @Test
  public void verifyCommodityCodeProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setCommodityCode(COMMODITY_CODE);

    // Then
    assertEquals(COMMODITY_CODE, treeNode.getCommodityCode());
  }

  @Test
  public void verifyDeclarableProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setDeclarable(DECLARABLE);

    // Then
    assertEquals(DECLARABLE, treeNode.isDeclarable());
  }

  @Test
  public void verifyCEDProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setCED(CED);

    // Then
    assertEquals(CED, treeNode.isCED());
  }

  @Test
  public void verifyCVEDProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setCVED(CVED);

    // Then
    assertEquals(CVED, treeNode.isCVED());
  }

  @Test
  public void verifyIUUProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    
    // When
    treeNode.setIUU(IUU);

    // Then
    assertEquals(IUU, treeNode.isIUU());
  }

  @Test
  public void verifyIndentsProperty() {
    // Given
    TreeNode treeNode = new TreeNode();

    // When
    treeNode.setIndents(INDENTS);

    // Then
    assertEquals(INDENTS, treeNode.getIndents());
  }

  @Test
  public void verifyChildrenProperty() {
    // Given
    TreeNode treeNode = new TreeNode();
    TreeNode child1 = new TreeNode();
    child1.setCommodityCode(COMMODITY_CODE);
    TreeNode child2 = new TreeNode();
    child2.setCommodityCode(COMMODITY_CODE2);
    List<TreeNode> children = Arrays.asList(child1, child2);

    // When
    treeNode.setChildren(children);

    // Then
    assertEquals(COMMODITY_CODE, treeNode.getChildren().get(0).getCommodityCode());
    assertEquals(COMMODITY_CODE2, treeNode.getChildren().get(1).getCommodityCode());
  }

  @Test
  public void verifyToString() {
    TreeNode treeNode = new TreeNode();
    List<TreeNode> children = Lists.emptyList();
    String expResult = "TreeNode{" + "label=" + LABEL
            + ", description=" + DESCRIPTION 
            + ", commodityCode=" + COMMODITY_CODE 
            + ", declarable=" + DECLARABLE 
            + ", CED=" + CED
            + ", CVED=" + CVED 
            + ", IUU=" + IUU 
            + ", indents=" + INDENTS 
            + ", children=" + children + '}';

    //When
    treeNode.setLabel(LABEL);
    treeNode.setDescription(DESCRIPTION);
    treeNode.setCommodityCode(COMMODITY_CODE);
    treeNode.setDeclarable(DECLARABLE);
    treeNode.setCED(CED);
    treeNode.setCVED(CVED);
    treeNode.setIUU(IUU);
    treeNode.setIndents(INDENTS);
    treeNode.setChildren(children);

    // Then
    assertEquals(expResult, treeNode.toString());
  }
  
}
