package ir.mortenahoofferapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ir.mortenahoofferapi.models.Supplier;
@Repository

public interface ISupplierRepository extends JpaRepository<Supplier,Long> {
}
