package com.thoughtworks.capacity.gtb.mvc.service.Impl;

import com.thoughtworks.capacity.gtb.mvc.entity.User;
import com.thoughtworks.capacity.gtb.mvc.exception.AccountExistedException;
import com.thoughtworks.capacity.gtb.mvc.exception.PasswordErrorException;
import com.thoughtworks.capacity.gtb.mvc.exception.UserNotFoundException;
import com.thoughtworks.capacity.gtb.mvc.repository.IUserRepository;
import com.thoughtworks.capacity.gtb.mvc.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 11:14 下午
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;

    @Override
    public void register(User user) {
        User userFindByUsername = userRepository.findUserByUsername(user.getUsername());

        if (!isNull(userFindByUsername)) {
            throw new AccountExistedException();
        }

        userRepository.createUser(user);
    }

    @Override
    public User login(String username, String password) {
        User userFindByUsername = userRepository.findUserByUsername(username);
        if (isNull(userFindByUsername)) {
            throw new UserNotFoundException();
        }

        if (!userFindByUsername.getPassword().equals(password)) {
            throw new PasswordErrorException();
        }

        return userFindByUsername;
    }
}
