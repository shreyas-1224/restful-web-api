package com.example.restfulwebservices.user;

import com.example.restfulwebservices.ExceptionHandler.BadRequest;
import com.example.restfulwebservices.ExceptionHandler.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResources {

    private UserDaoService service;
    public UserResources(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){

        return service.findAAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("no user with given id is present");
        }
        return  user;
    }

    @PostMapping(path = "users")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        if (service.saveOne(user)) {
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(user.getId())
                    .toUri();
            return ResponseEntity.created(location).body(user);

        }else{
            throw new BadRequest("Bad request , can not be processed further");      // bad request
        }
    }

    @DeleteMapping(path = "users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        boolean deleted = service.deleteOne(id);
        if(deleted)
            return ResponseEntity.ok("user deleted successfully");
        else
            throw new UserNotFoundException("Cant find the user to be deleted");
    }
}
