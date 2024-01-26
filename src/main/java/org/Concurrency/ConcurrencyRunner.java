package org.Concurrency;

import java.util.List;

public class ConcurrencyRunner {

    public static void main(String[] args) {

        List<Integer> teste = List.of(1, 3, 2, 6, 1, 2);

        System.out.println(DivisibleSumPairs.divisibleSumPairs(6, 3, teste));

    }
}
