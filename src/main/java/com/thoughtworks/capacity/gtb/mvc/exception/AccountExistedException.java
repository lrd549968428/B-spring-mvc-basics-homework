package com.thoughtworks.capacity.gtb.mvc.exception;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 11:11 下午
 */
public class AccountExistedException extends RuntimeException {
    public AccountExistedException() {
    }

    public AccountExistedException(String message) {
        super(message);
    }

    public AccountExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountExistedException(Throwable cause) {
        super(cause);
    }

    public AccountExistedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
