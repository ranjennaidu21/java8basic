package com.ranjen.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMaxMinExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //will set each new value in y.
                //x value hold max value of each element in the iteration
                .reduce(0,(x,y)-> x>y? x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(integerList));

    }

}
