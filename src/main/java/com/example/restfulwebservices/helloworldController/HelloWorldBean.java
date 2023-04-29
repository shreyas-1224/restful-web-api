package com.example.restfulwebservices.helloworldController;

public class HelloWorldBean {
    private String message;
    private Integer salary;
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public HelloWorldBean(String message) {
        this.salary = 100000;
        this.message = message;
    }

    public HelloWorldBean(String message , Integer salary){
        this.message = message;
        this.salary = salary;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                ", salary=" + salary +
                '}';
    }


}
