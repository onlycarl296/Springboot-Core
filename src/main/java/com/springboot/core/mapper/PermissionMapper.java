package com.springboot.core.mapper;

import com.springboot.core.dto.request.PermissionRequest;
import com.springboot.core.dto.response.PermissionResponse;
import com.springboot.core.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
