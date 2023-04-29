package com.example.restfulwebservices.helloworldController;

import java.util.List;

public class FunctionalProgramming {


    public static void main(String[] args) {
        System.out.println("Shreyas here");
        // create a list of numbers.
        printFunctionalWay(List.of(22,34,13,67,23,98,25,21,75,45));
        printEvenFunctionalWay(List.of(22,34,13,67,23,98,25,21,75,45));

    }

    private static boolean isEven(Integer integer) {
        return (integer%2 == 0);
    }

    private static void printEvenFunctionalWay(List<Integer> numbers) {
        numbers.stream()
                //.filter(FunctionalProgramming:: isEven)
                .filter(number -> number % 2 == 0)  // lambda expression.
                .forEach(System.out :: println);

    }

    private static void printFunctionalWay(List<Integer> numbers) {
        numbers.stream()
                //.forEach(FunctionalProgramming :: printNumbers );
                .forEach(System.out :: println);
    }

}


/* documentation:

in main , called a function printFunctionWay and passed a list of integers through it. in this method ,
first created a stream of numbers from the list by .stream(); then to access each member of that stream,
used forEach() and passed a method which tells what to do with given member.

you can simplify it even more by removing print method and instead of FunctionalProgramming::print ,we can simply write
numbers.stream().forEach(system.out :: println);


.filter() := to filter out only even numbers from stream. need a boolean function as a parameter.
             code inside .filter() can be replaced with lambda function.

.map() := similar to .filter() , we use map() and pass a lambda function to it which modifies the given
            member.
            ex:  number.stream()
            .filter(number -> number%2== 0)
            .map(number -> number**2)               // print square of only even numbers.
            .forEach(System.out :: println);
*/