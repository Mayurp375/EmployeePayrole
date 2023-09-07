package com.employeepayrole.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ResponceNotFoundException extends RuntimeException {
    public ResponceNotFoundException() {
        super();
    }

    public ResponceNotFoundException(String message) {
        super(message);
    }

    public ResponceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
