package org.MethodReferences;

import java.util.List;

public class MethodReferenceRunner {

    public static void main(String[] args) {

        List.of("Ant", "Bat", "Cat", "Elephant")
                .stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        //using method reference at sout
        List.of("Ant", "Bat", "Cat", "Elephant")
                .stream()
                .map(String::length)
                .forEach(System.out::println);

        Integer max = List.of(23,45,67,34).stream()
                .filter(MethodReferenceRunner::isEven)
                .max(Integer::max)
                .orElse(0);
        System.out.println(max);
    }

    public static boolean isEven(Integer number){
        return number%2==0;
    }
}
