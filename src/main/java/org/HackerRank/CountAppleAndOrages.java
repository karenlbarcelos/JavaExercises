package org.HackerRank;

import java.util.List;

public class CountAppleAndOrages {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */
    public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree,
                                             List<Integer> apples, List<Integer> oranges) {

        int applesFell = 0, orangesFell = 0;

        for (int cont : apples) {
            int numberOfApples = appleTree + cont;
            if (isWithinRange(numberOfApples, houseStart, houseEnd)) {
                applesFell++;
            }
        }

        for (int cont : oranges) {
            int numberOfOranges = orangeTree + cont;
            if (isWithinRange(numberOfOranges, houseStart, houseEnd)) {
                orangesFell++;
            }
        }

        System.out.println(applesFell);
        System.out.println(orangesFell);
    }

    private static boolean isWithinRange(int position, int start, int end) {
        return position >= start && position <= end;
    }
}

class CountAppleAndOragesRunner {

    public static void main(String[] args) {

        //Use here to try out my code
        CountAppleAndOrages.countApplesAndOranges(7,11, 5, 15,
                List.of(-2,2,1), List.of(5,-6));
    }
}
