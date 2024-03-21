package org.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {

        List<Integer> reversedArray = new ArrayList<>();

        for(int i = a.size()-1; i >= 0; i--){
            reversedArray.add(a.get(i));
        }

        return reversedArray;

    }
}
