package com.example.demo.dto.request;

import com.example.demo.dto.respoonse.ProductResponse;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryRequest {
    private String name;

    List<ProductResponse> products = new ArrayList<>();
}
