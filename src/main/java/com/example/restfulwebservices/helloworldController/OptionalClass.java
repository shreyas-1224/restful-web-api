// use optional class to store the fruits name that starts with "c"
package com.example.restfulwebservices.helloworldController;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {
    public static void main(String[] args) {
        printStartWithC(List.of("apple" , "banana" , "cherry" , "dragonfruit" , "jackfruit"));
    }

    private static void printStartWithC(List<String> fruits){


        Predicate<? super String> predicate =  fruit -> fruit.startsWith("b");
        Optional<String> optionalFruit = fruits.stream()
                .filter(predicate)
                .findFirst();

        System.out.println(optionalFruit);                  // optional[banana]
        System.out.println(optionalFruit.get());            // banana
        System.out.println(optionalFruit.isPresent());      // true
        System.out.println(optionalFruit.isEmpty());        // false
        // but problem arises when we don't have any fruit that starts with "b";
        // and the problem is :
    }

}


/*
Documentation :

    in short, a Predicate is a functional interface that defines a boolean condition, while a lambda expression is
    a shorthand notation for defining an implementation of that interface or any other functional interface.

    The Optional class was introduced in Java 8 as a container object that may or may not contain a non-null value.
    It is designed to help developers avoid NullPointerExceptions in their code and to handle situations where
    a value might be missing.
    In other words, instead of returning a null value, you can wrap the result in an Optional object and return it.
    The caller can then decide what to do with the result, knowing that it may or may not be present.
    An Optional can be in one of two states: it can either contain a non-null value, or it can be empty.
    You can check if an Optional contains a value by calling its isPresent() method, and you can retrieve the value
    by calling its get() method (if it is present).

    Optional<String> optionalName = Optional.ofNullable(getName());
    if (optionalName.isPresent()) {
        System.out.println("Hello, " + optionalName.get() + "!");
    } else {
        System.out.println("Hello, stranger!");
    }


Here's an example of how to use Optional:
 */