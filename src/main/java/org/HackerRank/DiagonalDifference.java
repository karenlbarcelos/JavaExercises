package org.HackerRank;

import java.util.List;
import java.util.Map;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        //arr: [ [1,2,3], [4,5,6], [9,8,9] ]
        //arr.get(0): [1,2,3]
        //arr.get(1): [4,5,6]
        //arr.get(2): [9,8,9]

        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j <= i; j++) {
                rightDiagonal += arr.get(j).get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size()-1; j == arr.size()-1; j--) {
                j -= i;
                leftDiagonal += arr.get(i).get(j);
            }
        }

        int diagonalSum = rightDiagonal - leftDiagonal;

        return Math.abs(diagonalSum);
    }
}

class DiagonalDiferrenceRunner {

    public static void main(String[] args) {

        System.out.println(DiagonalDifference.diagonalDifference(List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        )));
    }

}