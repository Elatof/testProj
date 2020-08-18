package com.example.demo.mapper;

import com.example.demo.dto.request.CategoryRequest;
import com.example.demo.dto.respoonse.CategoryResponse;
import com.example.demo.model.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {
    Category requestToModel(CategoryRequest categoryRequest);

    CategoryResponse modelToResponse(Category category);
}
