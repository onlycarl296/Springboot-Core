package com.springboot.core.mapper;

import com.springboot.core.dto.request.RoleRequest;
import com.springboot.core.dto.response.RoleResponse;
import com.springboot.core.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    // Ở đây cần thao tác thêm do RoleRequest nhận vào permission là 1 set<String> trong khi role lại là 1 set<Permission>
    // => xử lý khi nó map thì nó sẽ bỏ qua => tự mình map
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
