package uk.gov.defra.tracesx.tradetariff.service;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gov.defra.tracesx.tradetariff.dao.entities.tree.TreeNode;
import uk.gov.defra.tracesx.tradetariff.dao.repositories.TradetariffRepository;
import uk.gov.defra.tracesx.tradetariff.exceptions.DuplicateEntryException;

@Service
public class TradetariffService {

  private final TradetariffRepository tradetariffRepository;

  @Autowired
  public TradetariffService(
      TradetariffRepository tradetariffRepository) {
    this.tradetariffRepository = tradetariffRepository;
  }

  public Long create(TreeNode treeNode) throws DuplicateEntryException {
    if (!tradetariffRepository.existsById(treeNode.getId())) {
      return tradetariffRepository.save(treeNode).getId();
    } else {
      throw new DuplicateEntryException(treeNode.getId());
    }
  }

  public TreeNode get(Long id) {
    final TreeNode treeNode = tradetariffRepository.findById(id).orElseThrow(() ->
      new EntityNotFoundException("TreeNode not found in the system. TreeNode Id: "+ id));
    return treeNode;
  }
}