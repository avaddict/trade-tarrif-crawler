package uk.gov.defra.tracesx.tradetariff;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uk.gov.defra.tracesx.tradetariff.dao.entities.tree.TreeNode;
import uk.gov.defra.tracesx.tradetariff.service.TradetariffClient;
import uk.gov.defra.tracesx.tradetariff.service.TradetariffService;

@SpringBootApplication
public class TradetariffApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(TradetariffApplication.class);
  
  public static void main(String[] args) {
    SpringApplication.run(TradetariffApplication.class, args);
  }

  @Autowired
  @Bean
  public CommandLineRunner run(TradetariffClient tradetariffClient,
          TradetariffService tradetariffService)
          throws Exception {
    return args -> {
      List<TreeNode> commodityTree = tradetariffClient.getCommodityTree();
      printTree(commodityTree);
      List<TreeNode> prunedTree = pruneTree(commodityTree);
      printTree(prunedTree);
      for (TreeNode treeNode : prunedTree) {
        tradetariffService.create(treeNode);
      }
    };
  }

    private void printTree(List<TreeNode> tree) {
    for (TreeNode treeNode : tree) {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < treeNode.getIndents(); i++) {
        builder.append("  ");
      }
      builder.append(treeNode.getLabel()).append(" ")
              .append(treeNode.getDescription()).append(" ")
              .append(treeNode.getCommodityCode()).append(" ");
      if (treeNode.isDeclarable()) {
        builder.append("declarable").append(" ");
      }
      if (treeNode.isCED()) {
        builder.append("CED").append(" ");
      }
      if (treeNode.isCVED()) {
        builder.append("CVED").append(" ");
      }
      if (treeNode.isIUU()) {
        builder.append("IUU").append(" ");
      }
      builder.append("\n");
      LOGGER.info(builder.toString());
      printTree(treeNode.getChildren());
    }
  }

  
  private List<TreeNode> pruneTree(List<TreeNode> tree) {
    return tree.stream()
            .filter(treeNode -> !(treeNode.isCED() || treeNode.isCVED()))
            .collect(Collectors.toList());
  }
}
