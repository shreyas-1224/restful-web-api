package com.example.restfulwebservices.helloworldController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Thank you for guiding me to the right path";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hey , i am thankful to everyone");
    }

    // path parameter
    @GetMapping(path = "/hello-world-bean/{name}/{salary}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name , @PathVariable int salary){
        return new HelloWorldBean(name , salary);
    }

}
