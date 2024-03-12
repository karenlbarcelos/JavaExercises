package org.HackerRank;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {

        if (steps == 0) {
            return 0;
        }
        int numberOfValleys = 0, currentLevel = 0;

        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                currentLevel++;
                if (currentLevel == 0) {
                    numberOfValleys++;
                }
            } else {
                currentLevel--;
            }
        }

        return numberOfValleys;
    }

    public static void main(String[] args) {

        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
