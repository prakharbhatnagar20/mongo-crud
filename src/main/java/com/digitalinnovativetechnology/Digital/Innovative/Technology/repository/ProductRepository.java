package com.digitalinnovativetechnology.Digital.Innovative.Technology.repository;

import com.digitalinnovativetechnology.Digital.Innovative.Technology.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
