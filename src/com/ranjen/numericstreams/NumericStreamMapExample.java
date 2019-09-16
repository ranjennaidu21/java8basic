package com.ranjen.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    //mapToObj - convert each element of numeric stream to some object
    //mapToLong - convert a numeric Stream to a Long Stream
    //mapToDouble - convert a numeric Stream to a Double Stream

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5) //instream
                .mapToLong((i) -> i) //i is passed from instream , convert instream to longStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5) //instream
                .mapToDouble((i) -> i) //i is passed from instream , convert instream to doubleStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(mapToObject());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }

}
