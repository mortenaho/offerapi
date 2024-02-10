package ir.mortenahoofferapi.controllers;

import ir.mortenahoofferapi.models.Product;
import ir.mortenahoofferapi.repositories.IProductRepository;

import ir.mortenahoofferapi.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

}
