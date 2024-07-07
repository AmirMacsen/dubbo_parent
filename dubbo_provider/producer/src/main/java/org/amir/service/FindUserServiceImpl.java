package org.amir.service;

import org.amir.api.IFindUserService;
import org.amir.mapper.UserMapper;
import org.amir.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class FindUserServiceImpl implements IFindUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findUsers() {
        return userMapper.selectList(null);
    }
}
