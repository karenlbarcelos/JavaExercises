package org.LambdaExpression;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Strawberry", "Banana", "Blueberry", "Apple", "Raspberry");

        List<Integer> listNumber = List.of(4,6,8,13,3,15);

        printSquares();

    }

    private static void printBasic(List<String> list) {

        for (String word : list) {
            System.out.println(word);
        }
    }

    private static void printBasicFiltering(List<String> list) {

        for (String word : list) {
            if (word.endsWith("erry")) {
                System.out.println(word);
            }
        }
    }


    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFPFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("erry")
                )
                .forEach(
                        element -> System.out.println(element)
                );
    }

    private static void printWithFPSum(List<Integer> list) {
        int sum = list.stream()
                .filter(element -> element % 2 == 1)
                .reduce(0, (number1, number2) -> number1 + number2);

        System.out.println(sum);
    }

    //Exercise - Print squares of first 10 numbers
    private static void printSquares(){
        IntStream.range(1, 11).map(e -> e * e).forEach(System.out::println);
    }
}