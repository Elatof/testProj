package com.example.demo.dto.respoonse;

import com.example.demo.model.Category;
import lombok.Data;

import java.util.Date;

@Data
public class ProductResponse {
    private int id;

    private String name;

    private String description;

    private int price;

    private Date releaseDate;

    private CategoryResponse category;
}
