package com.huunghia.bliss.service;

import com.huunghia.bliss.dto.UserDto;
import com.huunghia.bliss.entity.User;

import java.util.List;

public interface IUserService {
    User insertNewUser(UserDto request);
    User updateUser(UserDto request, Long id);
    void deleteUser(Long id);
    User getUser(Long id);
    List<User> getAllUser();
}
