package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id;

    private String name;
    private String city;
    private String state;
    private String[] tags;
    private String website;
    private Boolean isOpen;
    private String address;
    private String zipCode;
    private String imageUrl;
    private Double latitude;
    private Double longitude;
    private String priceRange;
    private String description;
    private String phoneNumber;
    private String cuisineType;
    private Integer reviewCount;
    private String openingHours;
    private Double averageRating;
}
