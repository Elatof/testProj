package com.example.demo.mapper;

import com.example.demo.dto.respoonse.ProductResponse;
import com.example.demo.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product requestToModel(ProductResponse productResponse);

    ProductResponse modelToResponse(Product product);
}
