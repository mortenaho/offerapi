package ir.mortenahoofferapi.repositories;

import ir.mortenahoofferapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
