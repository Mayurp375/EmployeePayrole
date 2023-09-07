package com.employeepayrole.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.http.HttpStatus;


@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ResponceDTo {
  private final String message;
  private final Throwable throwable;
  private final HttpStatus httpStatus;

}
