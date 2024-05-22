package com.huunghia.bliss.mapper;

import com.huunghia.bliss.dto.RoleDto;
import com.huunghia.bliss.entity.Role;

public interface IRoleMapper {
    Role toRole(RoleDto request);
}
