package org.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Result {
    public static void staircase(int n) {

        for(int i = 0;i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (i < n - 1 - j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
