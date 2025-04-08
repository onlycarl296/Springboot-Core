package com.springboot.core.mapper;

import com.springboot.core.dto.request.UserCreationRequest;
import com.springboot.core.dto.request.UserUpdateRequest;
import com.springboot.core.dto.response.UserResponse;
import com.springboot.core.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
