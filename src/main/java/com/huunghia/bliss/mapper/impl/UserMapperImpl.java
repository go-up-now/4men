package com.huunghia.bliss.mapper.impl;

import com.huunghia.bliss.dto.UserDto;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public User toUser(UserDto request) {
        if(request == null)
            return null;
        else{
            User user = new User();
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            user.setEmail(request.getEmail());
            user.setAddress(request.getAddress());
            user.setPhone(request.getPhone());
            user.setCreatedAt(LocalDateTime.now());
            user.setImg(request.getImg());
            user.setFullname(request.getFullname());
            user.setState(request.getState());

            return user;
        }
    }

    @Override
    public void updateUser(User user, UserDto request) {
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setAddress(request.getAddress());
        user.setPhone(request.getPhone());
        user.setBirthday(request.getBirthday());
        user.setCreatedAt(LocalDateTime.now());
        user.setImg(request.getImg());
        user.setFullname(request.getFullname());
        user.setState(request.getState());
        user.setGender(request.getGender());
    }

}
