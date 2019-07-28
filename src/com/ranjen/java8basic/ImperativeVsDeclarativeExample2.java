package com.ranjen.java8basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        // to differentiate btw Imperative(how) vs Declarative(what) programming
        //objective : removing duplicates from list of Integers

        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);

        //Remove the duplicates from the list. We going to iterate each number in Integer and add number only once if it
        //is duplicated

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i :integerList)
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        System.out.println("unique List : " + uniqueList);

        /**
         * Declarative Syle
         */

        List<Integer> uniqueList1 = integerList //the source
                .stream() //the java 8 function
                .distinct()
                .collect(Collectors.toList()); //want to collect as list
        System.out.println("uniqueList1 List : " + uniqueList1);
    }
}
