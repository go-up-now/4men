package com.huunghia.bliss.service.impl;

import com.huunghia.bliss.dto.request.RoleRequest;
import com.huunghia.bliss.entity.Role;
import com.huunghia.bliss.mapper.IRoleMapper;
import com.huunghia.bliss.repository.RoleRepository;
import com.huunghia.bliss.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    IRoleMapper roleMapper;
    RoleRepository roleRepository;

    @Override
    public Role createRole(RoleRequest request) {
        Role role = roleMapper.toRole(request);
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public Role updateRole(RoleRequest request, Long id) {
        Role role = roleMapper.toRole(request);
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Role getRole(Long id) {
        return roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
