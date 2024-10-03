package com.digitalinnovativetechnology.Digital.Innovative.Technology.service;

import com.digitalinnovativetechnology.Digital.Innovative.Technology.model.Product;
import com.digitalinnovativetechnology.Digital.Innovative.Technology.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        product.setProductId(UUID.randomUUID().toString());
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getProduct(String productId) {
        return productRepository.findById(productId).get();
    }
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getProductId()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductDescription(product.getProductDescription());
        existingProduct.setProductPrice(product.getProductPrice());
        return productRepository.save(existingProduct);

    }

    public String deleteProduct(String productId) {
        productRepository.deleteById(productId);
        return productId+"Product deleted";
    }
}
