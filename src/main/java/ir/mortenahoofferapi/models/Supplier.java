package ir.mortenahoofferapi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
class Supplier {
    String fullname;
    String mobile;
    String address;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long supplierId ;
    Date createdDate;
    @OneToMany(mappedBy="Supplier")
    private Set<Product> products;
}