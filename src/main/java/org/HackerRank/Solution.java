package org.HackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {

        List<Integer> teste = List.of(1,2,1,3,2);

        System.out.println(SubarrayDivision.birthday(teste, 3, 2));

    }
}
