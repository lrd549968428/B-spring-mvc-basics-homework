package com.thoughtworks.capacity.gtb.mvc.exception;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 11:13 下午
 */
public class PasswordErrorException extends RuntimeException {
    public PasswordErrorException() {
    }

    public PasswordErrorException(String message) {
        super(message);
    }

    public PasswordErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordErrorException(Throwable cause) {
        super(cause);
    }

    public PasswordErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
