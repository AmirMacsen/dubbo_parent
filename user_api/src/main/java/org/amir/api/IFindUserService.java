package org.amir.api;

import org.amir.pojo.User;

import java.util.List;

/**
 * 查询用户
 */
public interface IFindUserService {
    List<User> findUsers();
}
