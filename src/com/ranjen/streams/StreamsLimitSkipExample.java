package com.ranjen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limitTest(List<Integer> integerList){
        return integerList.stream()
                .limit(2) //pass only 6 and 7
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skipTest(List<Integer> integerList){
        return integerList.stream()
                .skip(3) //skip first 3 elements and pass 9 and 10
                .reduce((x,y)->x+y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitValue = limitTest(integerList);
        if(limitValue.isPresent()){
            System.out.println(limitValue.get());
        }else{
            System.out.println("No Input is passed");
        }

        Optional<Integer> skipValue = skipTest(integerList);
        if(skipValue.isPresent()){
            System.out.println(skipValue.get());
        }else{
            System.out.println("No Input is passed");
        }
    }

}
