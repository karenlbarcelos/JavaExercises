package org.HackerRank;

import java.util.HashMap;
import java.util.List;

public class SockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        //n = 7
        //ar = [1,2,1,2,1,3,2]
        //output = 2 - one pair of 1 and one pair of 2
        HashMap<Integer, Integer> colorCount = new HashMap<>();

        for(int i = 0; i < n; i++){
            colorCount.put(ar.get(i), colorCount.getOrDefault(ar.get(i),0) +1);
        }

        // Contar o número de pares de meias
        int pairCount = 0;
        for (Integer count : colorCount.values()) {
            pairCount += count / 2;
        }

        // Imprimir o número de pares de meias
        return pairCount;

    }

    public static void main(String[] args) {

        sockMerchant(7, List.of(1,2,1,2,1,3,2));
    }
}
