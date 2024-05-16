package com.huunghia.bliss.mapper.impl;

import com.huunghia.bliss.dto.request.RoleRequest;
import com.huunghia.bliss.entity.Role;
import com.huunghia.bliss.mapper.IRoleMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapperImpl implements IRoleMapper {
    @Override
    public Role toRole(RoleRequest request) {
        Role role = new Role();
        role.setId(request.getId());
        role.setName(request.getName());

        return role;
    }
}
