package com.ranjen.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
        .boxed()
        //instream to primitive
        .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue) //give Instream back from integerList
                .sum();
    }

    public static void main(String[] args) {
        //Boxing - converting primitive type(int) to wrapper class type(Integer)
        System.out.println("Boxing: "+boxing());

        //Unboxing - converting wrapper class type(Integer) to primitive type(int)
        List<Integer> integerList = boxing();
        System.out.println("Unboxing : " + unBoxing(integerList));
    }

}
