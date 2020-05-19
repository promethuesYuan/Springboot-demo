package com.promethuesYuan.service;

import com.promethuesYuan.entity.User;

public interface UserService {

    void register(User user);

    User login(String username, String password);

}
