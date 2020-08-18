package com.example.demo.dto.request;

import com.example.demo.dto.respoonse.CategoryResponse;
import lombok.Data;

import java.util.Date;

@Data
public class ProductRequest {

    private String name;
    private String description;
    private int price;
    private Date releaseDate;
    private CategoryResponse category;
}
