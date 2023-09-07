package com.employeepayrole.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Slf4j
public class EmployeePyrollExcetionalHandler {
    private static final String massage = "Exception while processing Rest Request";

    public ResponseEntity<ResponceDTo> handelCloudVendorNotFoundException
            (ResponceNotFoundException responceNotFoundException) {
        log.debug("this is exception");
        ResponceDTo responceDTo = new ResponceDTo("Error in response",new Throwable(), HttpStatus.NOT_FOUND);
//                .httpStatus(HttpStatus.NOT_FOUND).
//                throwable(new Throwable()).message("Error in response").build();

        return new ResponseEntity<ResponceDTo>(responceDTo, HttpStatus.NOT_FOUND);
    }
}
