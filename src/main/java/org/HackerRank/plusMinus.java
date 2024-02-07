package org.HackerRank;

import java.util.List;

class PlusMinus {
    public static void plusMinus(List<Integer> arr) {

        float positive = 0;
        int negative = 0;
        float zeros = 0;

        for(int value : arr){
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zeros ++;
            }
        }

        System.out.format("%.6f%n", (positive/arr.size()), (negative/arr.size()), (zeros/arr.size()));
        System.out.format("%.6f%n", ((float)negative/arr.size())); //using cast
        System.out.format("%.6f%n", (zeros/arr.size()));

    }
}

class plusMinusRunner {
    public static void main(String[] args) {

        List<Integer> arr = List.of(1,1,0,-1,-1);

        PlusMinus.plusMinus(arr);

    }
}
