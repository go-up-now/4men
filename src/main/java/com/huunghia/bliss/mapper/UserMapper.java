package com.huunghia.bliss.mapper;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

//@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdationRequest request);
}
