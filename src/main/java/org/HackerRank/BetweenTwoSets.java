package org.HackerRank;

import java.util.List;

public class BetweenTwoSets {

    int getGCD( int n1, int n2){
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    int getLCM( int n1, int n2){
        if (n1 == 0 || n2 == 0)
            return 0;
        else {
            int gcd = getGCD(n1, n2);
            return Math.abs(n1 * n2) / gcd;
        }
    }

    public int getTotalX(List<Integer> a, List<Integer> b) {

        // a [2, 4]     =  4, 8, 12, 16 % 2 e 4 == 0
        // b [16, 32, 96]
        // ret 3 - 4, 8, 16

        int result = 0;

        int lcm = a.get(0);
        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }

        int gcd = b.get(0);
        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        // Count multiples of lcm that divide the gcd
        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0)
                result++;
        }

        return result;
    }
}
