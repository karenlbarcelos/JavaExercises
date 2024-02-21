package org.HackerRank;

public class NumberLineJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int h = x2 - x1;

        if((v1 > v2) && (h % (v1-v2) == 0)){
            return "YES";
        } else {
            return "NO";
        }
    }
}

class NumberLineJumpsRunner{

    public static void main(String[] args) {

        System.out.println(NumberLineJumps.kangaroo(0,3, 4, 2));
    }
}
