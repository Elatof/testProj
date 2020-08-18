package com.example.demo.service;

import com.example.demo.dto.request.CategoryRequest;
import com.example.demo.dto.respoonse.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAllCategories();

    CategoryResponse findCategoryById();

    CategoryResponse saveCategory(CategoryRequest categoryRequest);

    CategoryResponse updateCategoryById(int id, CategoryRequest categoryRequest);

    void deleteCategoryById(int id);
}
