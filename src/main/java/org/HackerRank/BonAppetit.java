package org.HackerRank;

import java.util.List;

public class BonAppetit {
    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int totalAnn = 0;

        for(int i = 0; i < bill.size(); i++){
            if(i != k){
                totalAnn += bill.get(i);
            }
        }

        int paidAnn = b-(totalAnn/2);

        if(paidAnn == 0){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(paidAnn);
        }

    }

    public static void main(String[] args) {
        bonAppetit(List.of(3,10,2,9), 1, 12);
    }
}
