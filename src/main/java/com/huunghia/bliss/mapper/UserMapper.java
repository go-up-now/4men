package com.huunghia.bliss.mapper;

import com.huunghia.bliss.dto.UserDto;
import com.huunghia.bliss.entity.User;
import org.mapstruct.MappingTarget;

//@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserDto request);
    void updateUser(@MappingTarget User user, UserDto request);
}
