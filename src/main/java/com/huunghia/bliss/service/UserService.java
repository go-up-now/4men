package com.huunghia.bliss.service;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.Role;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.mapper.UserMapperImpl;
import com.huunghia.bliss.repository.RoleRepository;
import com.huunghia.bliss.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapperImpl userMapper;

    @Autowired
    RoleRepository roleRepository;

    public User createRequest(UserCreationRequest request){
        if(userRepository.existsByUsername(request.getUsername()))
            throw new RuntimeException("Username existed");
        Role role = getRole(3L);
        User user = userMapper.toUser(request);
        user.setRole(role);

        return userRepository.save(user);
    }

    public User updateRequest(UserUpdationRequest request, Long id){
        User user = this.getUser(id);

        userMapper.updateUser(user, request);

        return userRepository.save(user);
    }

    public void deleteRequest(Long id){
        userRepository.deleteById(id);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found") );
    }

    public Role getRole(Long id){
        return roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found") );
    }
}
