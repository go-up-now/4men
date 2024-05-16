package com.huunghia.bliss.mapper;

import com.huunghia.bliss.dto.request.RoleRequest;
import com.huunghia.bliss.entity.Role;

public interface IRoleMapper {
    Role toRole(RoleRequest request);
}
