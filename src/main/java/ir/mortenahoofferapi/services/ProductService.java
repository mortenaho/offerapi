package ir.mortenahoofferapi.services;

import ir.mortenahoofferapi.repositories.IProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    IProductRepository productRepository;
    ProductService(IProductRepository productRepository){
        this.productRepository=productRepository;
    }
}
