package com.greatlearning.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Role;
import com.greatlearning.repository.RoleRepository;
import com.greatlearning.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleByUsername(String username) {
        return roleRepository.findByUsername(username);
    }
}
