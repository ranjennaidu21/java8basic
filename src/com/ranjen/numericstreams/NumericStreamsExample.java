package com.ranjen.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfInt(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y)->x+y);
    }

    public static int sumOfIntStream(){
        return IntStream.rangeClosed(1,6) //1,2,3,4,5,6
                .sum();
    }

    public static void main(String[] args) {
        //if use regular stream reduce method it have to unboxing to convert Integer to int
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of Integers using Stream reduce: "+sumOfInt(integerList));
        //so instead of that recommended to use the IntStream
        System.out.println("Sum of Integers using IntStream: "+sumOfIntStream());
    }

}
