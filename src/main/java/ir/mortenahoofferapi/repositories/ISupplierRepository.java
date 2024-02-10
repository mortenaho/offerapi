package ir.mortenahoofferapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.Supplier;

public interface ISupplierRepository extends JpaRepository<Supplier,Long> {
}
