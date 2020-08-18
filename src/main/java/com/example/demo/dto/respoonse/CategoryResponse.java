package com.example.demo.dto.respoonse;

import com.example.demo.model.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryResponse {
    private int id;

    private String name;

    List<ProductResponse> products = new ArrayList<>();
}
