package com.szymon.dao;

import java.util.List;
import com.szymon.builder.User;

public interface UserDao {


    List<User> getAllUsers();

    void addUser(User user);
}
