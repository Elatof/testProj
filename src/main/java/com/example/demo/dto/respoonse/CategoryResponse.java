package com.example.demo.dto.respoonse;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryResponse {

    private int id;
    private String name;
    private List<ProductResponse> products = new ArrayList<>();
}
