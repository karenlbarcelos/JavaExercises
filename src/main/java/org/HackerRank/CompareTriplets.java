package org.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int[] tripletsResult = new int[2];

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                tripletsResult[0] = tripletsResult[0] + 1;
            } else if (b.get(i) > a.get(i)) {
                tripletsResult[1] = tripletsResult[1] + 1;
            }
        }

        List<Integer> tripletsResult1 = new ArrayList<>(List.of(tripletsResult[0], tripletsResult[1]));

        return tripletsResult1;

    }

    public static void main(String[] args) {

        compareTriplets(List.of(5,7,7), List.of(3,6,10));
    }
}
