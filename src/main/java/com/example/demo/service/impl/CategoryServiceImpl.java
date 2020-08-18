package com.example.demo.service.impl;

import com.example.demo.dto.request.CategoryRequest;
import com.example.demo.dto.respoonse.CategoryResponse;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

//    private final CategoryRepository categoryRepository;
//    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryResponse> findAllCategories() {
//        List<Category> categories = (List<Category>) categoryRepository.findAll();
//
//        return categories.stream()
//                .map(categoryMapper::modelToResponse)
//                .collect(Collectors.toList());
        return null;
    }

    @Override
    public CategoryResponse findCategoryById() {
        return null;
    }

    @Override
    public CategoryResponse saveCategory(CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public CategoryResponse updateCategoryById(int id, CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public void deleteCategoryById(int id) {

    }
}
