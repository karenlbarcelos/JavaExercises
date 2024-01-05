package org.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseRunner {

    public static void main(String[] args) {

        //qts vezes cada caractere esta presente na string
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String sentence = sc.nextLine();

        Map<Character, Integer> occurances = new HashMap<>();

        char[] chars = sentence.toCharArray();

        for (char character : chars){
            Integer integer = occurances.get(character);
            if(integer == null){
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
            }
        }

        System.out.println(occurances);

        String[] words = sentence.split(" ");

        Map<String, Integer> stringOccurances = new HashMap<>();

        for(String word : words){
            Integer integer = stringOccurances.get(word);
            if(integer == null){
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer+1 );
            }
        }

        System.out.println(stringOccurances);

    }
}
