package com.huunghia.bliss.service;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.User;

import java.util.List;

public interface IUserService {
    User insertNewUser(UserCreationRequest request);
    User updateUser(UserUpdationRequest request, Long id);
    void deleteUser(Long id);
    User getUser(Long id);
    List<User> getAllUser();
}
