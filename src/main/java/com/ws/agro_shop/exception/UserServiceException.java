package com.ws.agro_shop.exception;

/**
 * Exception is thrown in case of invalid user data or in case
 * of incorrect input of captcha input.
 * The class {@code UserServiceException} and its subclasses are a form of
 * {@code Exception} that indicates conditions that a reasonable
 * application might want to catch. The class {@code Exception} and any
 * subclasses are checked exceptions. Checked exceptions need to be
 * declared in a method or constructor's {@code throws} clause if they
 * can be thrown by the execution of the method or constructor and
 * propagate outside the method or constructor boundary.
 */
public class UserServiceException extends Exception {

    /**
     * Constructs a new exception as its detail message.
     */
    public UserServiceException(String message) {
        super(message);
    }
}
