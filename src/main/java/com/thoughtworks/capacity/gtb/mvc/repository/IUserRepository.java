package com.thoughtworks.capacity.gtb.mvc.repository;

import com.thoughtworks.capacity.gtb.mvc.entity.User;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 10:39 下午
 */
public interface IUserRepository {
    void createUser(User user);

    void deleteUser(String username);

    User findUserByUsername(String username);

    List<User> findAllUser();

    User updateUser(long id);
}
