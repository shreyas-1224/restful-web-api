package com.example.restfulwebservices.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetails> customizedExceptionHandler(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDateTime.now() , ex.getMessage() , request.getDescription(false));
        return new ResponseEntity<ErrorDetails>(error , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ErrorDetails> customizedNotFoundExceptionHandler(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDateTime.now() , ex.getMessage() , request.getDescription(false));
        return new ResponseEntity<ErrorDetails>(error , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequest.class)
    public final ResponseEntity<ErrorDetails> customizedBadrequestExceptionHandler(Exception ex, WebRequest request) throws Exception {
        ErrorDetails error = new ErrorDetails(LocalDateTime.now() , ex.getMessage() , request.getDescription(false));
        return new ResponseEntity<ErrorDetails>(error , HttpStatus.BAD_REQUEST);
    }

}
