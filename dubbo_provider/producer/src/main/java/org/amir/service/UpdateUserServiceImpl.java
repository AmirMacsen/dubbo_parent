package org.amir.service;

import org.amir.api.IUpdateUserService;
import org.amir.mapper.UserMapper;
import org.amir.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class UpdateUserServiceImpl implements IUpdateUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User preUpdateUser(User user) {
        return userMapper.selectById(user.getId());
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }
}
