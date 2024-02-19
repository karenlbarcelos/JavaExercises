package org.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Grading {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> aux = new ArrayList<>();

        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) >= 38){
                if((grades.get(i)+1) % 5 == 0){
                    int add1List = grades.get(i)+1;
                    aux.add(add1List);
                }else if((grades.get(i)+2) % 5 == 0){
                    int add2List = grades.get(i)+2;
                    aux.add(add2List);
                } else {
                    aux.add(grades.get(i));
                }
            } else {
                aux.add(grades.get(i));
            }
        }


        return aux;
    }

}

class GradingStudentsRunner{

    public static void main(String[] args) {

        Grading.gradingStudents(List.of(73,67,38,33));
    }
}
