package com.huunghia.bliss.mapper;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.Role;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public User toUser(UserCreationRequest request) {
        if(request == null)
            return null;
        else{
            User user = new User();
            user.setUsername(request.getUsername());
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
            return user;
        }
    }

    @Override
    public void updateUser(User user, UserUpdationRequest request) {
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
