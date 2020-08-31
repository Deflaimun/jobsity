package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        //basic test
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(2);
        lista.add(4);


        System.out.println(segment(2,lista));


    }


    private static int segment(int x, List<Integer> space) {
        List<Integer> allResults = new ArrayList<>();

        for (int j = 0; j < space.size(); j++) {
            List<Integer> testList = new ArrayList<>();


            for (int i = 0; i < x; i++) {
                if(i+j >=space.size()){
                    continue;
                }
                testList.add(space.get(i+j));
            }
            if (!testList.isEmpty()) {
                allResults.add(testList.stream().sorted(Comparator.naturalOrder()).findFirst().get()); //get minimum value

            }
        }
        return (allResults.stream().sorted(Comparator.reverseOrder()).findFirst().get());//get max
    }
}


