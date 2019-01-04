package uk.gov.defra.tracesx.tradetariff.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.gov.defra.tracesx.tradetariff.dao.entities.tree.TreeNode;

@Repository
public interface TradetariffRepository extends CrudRepository<TreeNode, Long> {}
