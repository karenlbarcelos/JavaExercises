package org.HackerRank;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int maxCost = -1;

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int cost = keyboard + drive;
                if(cost <= b && maxCost < cost){
                    maxCost = cost;
                }
            }
        }
        return maxCost;

    }

    public static void main(String[] args) {

        System.out.println(getMoneySpent(new int[] {6}, new int[] {5,8}, 10 ));
    }
}
