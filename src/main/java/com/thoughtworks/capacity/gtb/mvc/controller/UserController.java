package com.thoughtworks.capacity.gtb.mvc.controller;

import com.thoughtworks.capacity.gtb.mvc.entity.User;
import com.thoughtworks.capacity.gtb.mvc.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 11:39 下午
 */
@Validated
@RestController
@RequiredArgsConstructor
public class UserController {
    private final String userNameRegExp = "^[a-zA-Z0-9_]{3,10}$";
    private final String userNameErrorMessage = "Illegal username";
    private final String passwordRegExp = "^.{5,12}$";
    private final String passwordErrorMessage = "Illegal password";

    private final IUserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestParam(name = "id") long id,
                         @RequestParam(name = "username")
                         @Pattern(regexp = userNameRegExp, message = userNameErrorMessage)
                                 String username,
                         @RequestParam(name = "password")
                         @Pattern(regexp = passwordRegExp, message = passwordErrorMessage)
                                 String password,
                         @Email String email) {
        userService.register(new User(id, username, password, email));
    }

    @GetMapping("/login")
    public User login(@RequestParam(name = "username")
                      @Pattern(regexp = userNameRegExp, message = userNameErrorMessage)
                              String username,
                      @RequestParam(name = "password")
                              String password) {
        return userService.login(username, password);
    }
}
