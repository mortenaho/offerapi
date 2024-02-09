package ir.mortenahoofferapi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) long productId;
    String productName;
    String productDescription;
    byte image;
    long price;
    int offer;
    String endDate;
    Date createdDate;
    @ManyToOne
    @JoinColumn(name="supplierId", nullable=false)
    private Supplier supplier;
}
