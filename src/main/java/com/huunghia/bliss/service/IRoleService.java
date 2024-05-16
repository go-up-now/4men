package com.huunghia.bliss.service;

import com.huunghia.bliss.dto.request.RoleRequest;
import com.huunghia.bliss.entity.Role;

import java.util.List;

public interface IRoleService {
    Role createRole(RoleRequest request);
    Role updateRole(RoleRequest request, Long id);
    void deleteRole(Long id);
    Role getRole(Long id);
    List<Role> getAllRoles();
}
