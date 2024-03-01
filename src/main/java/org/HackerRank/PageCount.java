package org.HackerRank;

public class PageCount {
    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here

        return Math.min(p/2, n/2 - p/2);
    }

    public static void main(String[] args) {

        System.out.println(pageCount(6,2));
    }
}
