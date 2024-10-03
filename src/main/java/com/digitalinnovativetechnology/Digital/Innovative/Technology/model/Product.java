package com.digitalinnovativetechnology.Digital.Innovative.Technology.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private String productCategory;
    private double productPrice;
    private int productQuantity;
}
