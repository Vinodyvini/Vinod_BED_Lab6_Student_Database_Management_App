package com.greatlearning.service;

import com.greatlearning.entity.User;

public interface UserService {
    User findByUsername(String username);
    boolean authenticate(String username, String password);
}
