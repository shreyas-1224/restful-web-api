package com.example.restfulwebservices.ExceptionHandler;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime time;
    private String message ;
    private String errorDetails;

    public ErrorDetails(LocalDateTime time, String message, String errorDetails) {
        this.time = time;
        this.message = message;
        this.errorDetails = errorDetails;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "time=" + time +
                ", message='" + message + '\'' +
                ", errorDetails='" + errorDetails + '\'' +
                '}';
    }


}
