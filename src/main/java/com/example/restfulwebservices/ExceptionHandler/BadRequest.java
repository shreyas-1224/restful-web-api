package com.example.restfulwebservices.ExceptionHandler;

public class BadRequest extends RuntimeException{
    public BadRequest(String message) {
        super(message);
    }
}
