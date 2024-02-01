package org.Concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        // arr = [1,3,5,7,9]
        // min = 1+3+5+7 = 16
        // max = 3+5+7+9 = 24
        // output 16 24

        Integer min = 0;
        Integer max = 0;

        for(int i = 0; i < arr.size()-1; i++){
            min += arr.get(i);
        }
        for(int j = 1; j < arr.size(); j++){
            max += arr.get(j);
        }

        System.out.printf(min + " " + max);
    }

}
