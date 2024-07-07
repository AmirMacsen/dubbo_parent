package org.amir.dubbo_consumer.service;

import org.amir.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser();

    void updateUser(User user);

    User preUpdateUser(Integer userId);

    void deleteUserById(Integer userId);
}
