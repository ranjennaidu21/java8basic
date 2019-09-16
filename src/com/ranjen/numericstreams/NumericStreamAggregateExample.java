package com.ranjen.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        //sum
        int sumOfInt = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum : "+sumOfInt);

        //max
        OptionalInt optInt = IntStream.rangeClosed(1,50).max();
        System.out.print("Max : ");
        System.out.println(optInt.isPresent()? optInt.getAsInt():0);

        //count will give 1 even for range from zero to zero
        System.out.println("Count :"+ IntStream.rangeClosed(0,0).count());

        //min
        OptionalLong optLong = LongStream.rangeClosed(1,50).min();
        System.out.print("Min : ");
        System.out.println(optLong.isPresent()? optLong.getAsLong():0);

        //average return double
        OptionalDouble optDouble = LongStream.rangeClosed(1,50).average();
        System.out.print("Average : ");
        System.out.println(optDouble.isPresent()? optDouble.getAsDouble():0);
    }

}
