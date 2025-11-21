package com.TROGON.LAB7;

import com.TROGON.LAB7.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private Map<Long, Product> productRepo = new HashMap<>();
    private Long currented = 1L;

    public ProductService() {
        productRepo.put(1L, new Product(1L, "Laptop Pro", 1500.0));
        productRepo.put(2L, new Product(2L, "Smartphone X", 800.0));
        productRepo.put(3L, new Product(3L, "tablet Z", 300.0));
        currentId = 4L;
    }
    public List<Product> getAllProducts() {
        return new ArrayList<>(productRepo.values());
    }
    public Optio
}
