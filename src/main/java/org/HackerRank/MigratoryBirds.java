package org.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        //Dada uma série de avistamentos de pássaros onde cada elemento representa um ID de tipo de pássaro, determine
        // o ID do tipo avistado com mais frequência. Se mais de um tipo tiver sido detectado nessa quantidade máxima,
        // retorne o menor de seus IDs.
        // arr = [1,1,2,2,3]
        //        0 0 1 1 2

        int[] countMax = new int[5];

        for(int cont : arr){
            switch (cont){
                case 1 -> countMax[0]++;
                case 2 -> countMax[2]++;
                case 3 -> countMax[3]++;
                case 4 -> countMax[4]++;
                case 5 -> countMax[5]++;
            }
        }

        int highest = 0, answer = 0;

        for(int i = 0; i < 5; i++){
            if(countMax[i] > highest){
                highest = countMax[i];
                answer = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(MigratoryBirds.migratoryBirds(List.of(1,4,4,4,5, 3)));
    }
}
