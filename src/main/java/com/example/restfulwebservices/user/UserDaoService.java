package com.example.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // implement methods related to the restful methods;
    private static List<User> users = new ArrayList<>();
    private static int count ;
    private static boolean created;
    static{
        users.add(new User(++count, "shreyas" , LocalDate.now().minusYears(23)));
        users.add(new User(++count , "kaviraj" , LocalDate.now().minusYears(24)));
        users.add(new User(++count , "priya" , LocalDate.now().minusYears(26)));
        users.add(new User(++count , "tejas" , LocalDate.now().minusYears(23)));
    }

    // findAll
    public List<User> findAAll(){
        return users;
    }

    // SaveOne
    public boolean saveOne(User user){

        user.setId(++count);
        try {
            created = users.add(user);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            return created;
        }
    }

    // findOne
    public User findOne(int id ){
        Predicate<? super User> predicate = user -> user.getId() == id;
        Optional<User> user = users.stream()
                .filter(predicate)
                .findFirst();

        return user.orElse(null);

    }

    public boolean deleteOne(int id){
        Predicate<? super User> Predicate = user -> user.getId() == id;
        return users.removeIf(Predicate);
    }


}
