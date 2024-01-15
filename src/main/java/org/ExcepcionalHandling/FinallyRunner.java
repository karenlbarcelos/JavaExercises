package org.ExcepcionalHandling;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[21];

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Before scanner close");
            if(sc!=null) {
                sc.close();
            }
        }

        System.out.println("Just before closing out main");

    }
}
