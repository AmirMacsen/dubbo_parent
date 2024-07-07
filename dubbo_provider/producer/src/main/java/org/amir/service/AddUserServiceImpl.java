package org.amir.service;

import org.amir.api.IAddUserService;
import org.amir.mapper.UserMapper;
import org.amir.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class AddUserServiceImpl implements IAddUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
