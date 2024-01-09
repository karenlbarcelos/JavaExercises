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
    }
}
