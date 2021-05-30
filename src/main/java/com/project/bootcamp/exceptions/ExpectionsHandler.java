package com.project.bootcamp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExpectionsHandler extends ResponseEntityExceptionHandler {
  @ExceptionHandler(BusinessExpection.class)
  protected ResponseEntity<ExceptionResponse> handleSecurity(BusinessExpection e) {
    return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse(e.getMessage()));
  }

  @ExceptionHandler(NotFoundExpection.class)
  protected ResponseEntity<ExceptionResponse> handleSecurity(NotFoundExpection e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(e.getMessage()));
  }
}
