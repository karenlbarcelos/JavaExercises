package org.CodingExercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FunctionalProgrammingMagic {

    /**
     * This method filters out the odd numbers from a given list of integers.
     *
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {

        return numbers.stream()
                .filter(FunctionalProgrammingMagic::oddNumbers)
                .collect(toList());
    }

    public static boolean oddNumbers(Integer number) {
        return number % 2 == 1 || number % 2 == -1;
    }

    /**
     * This method generates the cubes of the first n natural numbers.
     *
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {

        if (n <= 0) {
            return List.of();
        }

        return IntStream.rangeClosed(1, n)
                .map(FunctionalProgrammingMagic::cuberOfNumber)
                .boxed()
                .collect(toList());
    }

    public static int cuberOfNumber(int number) {
        return number * number * number;
    }

    /**
     * Length of Course Names
     * In this problem, you are required to complete the getCourseNameCharacterCount() function inside the
     * FunctionalProgrammingMagic class. This function receives a list of course names and returns a list of the
     * character counts of each course name.
     */
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {

        if (courses.isEmpty()) {
            return List.of();
        }

        return courses.stream()
                .map(String::length) //references method of length in String
                .collect(toList());
    }

    /**
     * Sum of Squares
     * You have to implement a function named sumOfSquares in the class FunctionalProgrammingMagic which takes a list
     * of integers as input and returns the sum of squares of these integers.
     */

    public static long sumOfSquares(List<Integer> numbers) {

        // Check if the list is null. If so, return 0.
        if (numbers == null) {
            return 0;
        }

        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream()
                .mapToLong(FunctionalProgrammingMagic::squareNumbers)
                .sum();
    }

    public static long squareNumbers(long numbers) {
        return (numbers * numbers);
    }

    /**
     * Find Max Even Number - In this task, you are given a list of integers. Your task is to complete the function
     * findMaxEvenNumber, which returns the maximum even number from the list. If the list is null or doesn't contain
     * any even numbers, return 0.
     */
    public static int findMaxEvenNumber(List<Integer> numbers) {

        if(numbers.isEmpty() || numbers == null){
            return 0;
        }

        return numbers.stream()
                .filter(FunctionalProgrammingMagic::evenNumbers)
                .max(Integer::compare)
                .orElse(0);

    }

    public static boolean evenNumbers(int number){
        return number % 2 == 0;
    }

}
