package org.amir.api;

import org.amir.pojo.User;

public interface IUpdateUserService {
    User preUpdateUser(User user);
    void updateUser(User user);
}
