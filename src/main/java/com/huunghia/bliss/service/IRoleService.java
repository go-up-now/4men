package com.huunghia.bliss.service;

import com.huunghia.bliss.dto.RoleDto;
import com.huunghia.bliss.entity.Role;

import java.util.List;

public interface IRoleService {
    Role createRole(RoleDto request);
    Role updateRole(RoleDto request, Long id);
    void deleteRole(Long id);
    Role getRole(Long id);
    List<Role> getAllRoles();
}
