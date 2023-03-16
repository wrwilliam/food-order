package com.dgut.repository;

import com.dgut.entity.User;
//combine
public interface UserRepository {
    public User login(String username, String password);
}
