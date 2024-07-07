package org.amir.service;

import org.amir.api.IDeleteUserService;
import org.amir.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 删除用户
 */
@DubboService
public class DeleteUserServiceImpl implements IDeleteUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void deleteUserById(Integer userId) {
        userMapper.deleteById(userId);
    }
}
