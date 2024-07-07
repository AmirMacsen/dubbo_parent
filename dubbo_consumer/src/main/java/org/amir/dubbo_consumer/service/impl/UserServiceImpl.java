package org.amir.dubbo_consumer.service.impl;

import org.amir.api.IAddUserService;
import org.amir.api.IDeleteUserService;
import org.amir.api.IFindUserService;
import org.amir.api.IUpdateUserService;
import org.amir.dubbo_consumer.service.UserService;
import org.amir.pojo.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @DubboReference
    private IAddUserService addUserService;

    @DubboReference
    private IFindUserService findUserService;

    @DubboReference
    private IUpdateUserService updateUserService;

    @DubboReference
    private IDeleteUserService deleteUserService;


    @Override
    public int addUser(User user) {
        return addUserService.addUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return findUserService.findUsers();
    }

    @Override
    public void updateUser(User user) {
        updateUserService.updateUser(user);
    }

    @Override
    public User preUpdateUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        return updateUserService.preUpdateUser(user);
    }

    @Override
    public void deleteUserById(Integer userId) {
        deleteUserService.deleteUserById(userId);
    }


}
