package com.huunghia.bliss.service.impl;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.mapper.UserMapper;
import com.huunghia.bliss.repository.RoleRepository;
import com.huunghia.bliss.repository.UserRepository;
import com.huunghia.bliss.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public User insertNewUser(UserCreationRequest request) {
        if(userRepository.existsByUsername(request.getUsername()))
            throw new RuntimeException("Username existed");
//        Role role = getRole(3L);
        User user = userMapper.toUser(request);
        //user.setRole(role);

        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserUpdationRequest request, Long id) {
        User user = this.getUser(id);

        userMapper.updateUser(user, request);

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
