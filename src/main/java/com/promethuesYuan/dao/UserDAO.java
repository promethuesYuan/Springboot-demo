package com.promethuesYuan.dao;

import com.promethuesYuan.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    void save(User user);

    User login(@Param("username") String username,@Param("password") String password);
}
