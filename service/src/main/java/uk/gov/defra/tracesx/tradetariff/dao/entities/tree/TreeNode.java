package uk.gov.defra.tracesx.tradetariff.dao.entities.tree;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "trade_tariff")
public class TreeNode {

  @Id
  @Column(columnDefinition = "uniqueidentifier")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;  
  
  @Column private String label;
  
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "parent_id")
  @Cascade(org.hibernate.annotations.CascadeType.ALL)
  private TreeNode parent;
  
  @Column private String description;
  
  @Column(name = "commodity_code")
  private String commodityCode;
  
  @Column private boolean declarable;
  
  @Column private boolean CED;
  
  @Column private boolean CVED;
  
  @Column private boolean IUU;

  @Column private int indents;
  
  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "children_id")
  @Cascade(org.hibernate.annotations.CascadeType.ALL)
  @Column private List<TreeNode> children;

  public TreeNode() {
  }

  public TreeNode(long id, String label, TreeNode parent, String description, String commodityCode, boolean declarable, boolean CED, boolean CVED, boolean IUU, int indents, List<TreeNode> children) {
    this.id = id;
    this.label = label;
    this.parent = parent;
    this.description = description;
    this.commodityCode = commodityCode;
    this.declarable = declarable;
    this.CED = CED;
    this.CVED = CVED;
    this.IUU = IUU;
    this.indents = indents;
    this.children = children;
  }

  public Long getId() {
    return id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public TreeNode getParent() {
    return parent;
  }

  public void setParent(TreeNode parent) {
    this.parent = parent;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public boolean isDeclarable() {
    return declarable;
  }

  public void setDeclarable(boolean declarable) {
    this.declarable = declarable;
  }

  public boolean isCED() {
    return CED;
  }

  public void setCED(boolean CED) {
    this.CED = CED;
  }

  public boolean isCVED() {
    return CVED;
  }

  public void setCVED(boolean CVED) {
    this.CVED = CVED;
  }

  public boolean isIUU() {
    return IUU;
  }

  public void setIUU(boolean IUU) {
    this.IUU = IUU;
  }

  public int getIndents() {
    return indents;
  }

  public void setIndents(int indents) {
    this.indents = indents;
  }

  public List<TreeNode> getChildren() {
    return children;
  }

  public void setChildren(List<TreeNode> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "TreeNode{" + "label=" + label
            + ", description=" + description
            + ", commodityCode=" + commodityCode
            + ", declarable=" + declarable
            + ", CED=" + CED
            + ", CVED=" + CVED
            + ", IUU=" + IUU
            + ", indents=" + indents
            + ", children=" + children + '}';
  }

}
