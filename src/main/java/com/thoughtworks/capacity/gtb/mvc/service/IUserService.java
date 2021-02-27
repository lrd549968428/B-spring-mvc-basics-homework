package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.entity.User;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 11:13 下午
 */
public interface IUserService {
    void register(User user);

    User login(String username, String password);
}
