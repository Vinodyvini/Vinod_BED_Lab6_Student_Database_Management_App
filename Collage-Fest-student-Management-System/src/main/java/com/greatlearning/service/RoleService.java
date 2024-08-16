package com.greatlearning.service;

import com.greatlearning.entity.Role;

public interface RoleService {
    Role findRoleByUsername(String username);
}
