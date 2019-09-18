package com.ranjen.parallelstreams;

import java.util.stream.IntStream;

public class SumClient {
    //if the variable is mutable, not recommended to use parallel,
    //as for this total the value is always changing parallelly

    public static void main(String[] args) {

        Sum sum=new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum); //result is : 500500

        System.out.println(sum.getTotal());

        //Each time you run , you can see the total value differs using parallel
    }

}
