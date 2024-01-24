package org.HackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SubarrayDivision {

    //          5
    //          1 2 1 3 2
    //          3d 2m
    //output    2
    public static int birthday(List<Integer> barSize, int day, int month) {

        int numberOfWays = 0;

        for (int i = 0; i <= barSize.size()-month; i++){
            int sum = 0;
            for (int j = i; j < i+month; j++){
                sum = sum + barSize.get(j);
            }
            if(sum == day) {
                numberOfWays += 1;
            }
        }

        return numberOfWays;
    }
}
