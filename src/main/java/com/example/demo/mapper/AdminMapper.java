package com.example.demo.mapper;

import com.example.demo.dto.request.AdminRequest;
import com.example.demo.dto.respoonse.AdminResponse;
import com.example.demo.model.Admin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    Admin requestToModel(AdminRequest adminRequest);

    AdminResponse modelToResponse(Admin admin);
}
