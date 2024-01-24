package org.HackerRank;

import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int max = scores.get(0);
        int min = scores.get(0);
        int countMax = 0;
        int countMin = 0;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
                countMax += 1;
            } else if (scores.get(i) < min) {
                min = scores.get(i);
                countMin += 1;
            }
        }

        List<Integer> returnPoints = List.of(countMax, countMin);

        return returnPoints;
    }
}
