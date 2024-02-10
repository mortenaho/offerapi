package ir.mortenahoofferapi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Supplier {
    String fullname;
    String mobile;
    String address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long supplierId ;
    Date createdDate;
    @OneToMany(mappedBy="supplier",fetch = FetchType.LAZY)
    List<Product> products;
}
