package com.thoughtworks.capacity.gtb.mvc.repository.Impl;

import com.thoughtworks.capacity.gtb.mvc.entity.User;
import com.thoughtworks.capacity.gtb.mvc.repository.IUserRepository;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 10:43 下午
 */
@Configuration
public class UserRepositoryImpl implements IUserRepository {

    private final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public void createUser(User user) {
        int code = user.getUsername().hashCode();
        this.userMap.put(code, user);
    }

    @Override
    public void deleteUser(String username) {
        this.userMap.remove(username.hashCode());
    }

    @Override
    public User findUserByUsername(String username) {
        return this.userMap.get(username.hashCode());
    }

    @Override
    public List<User> findAllUser() {
        return new ArrayList<>(this.userMap.values());
    }

    @Override
    public User updateUser(long id) {
        return null;
    }
}
