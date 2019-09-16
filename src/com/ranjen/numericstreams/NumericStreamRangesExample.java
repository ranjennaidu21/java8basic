package com.ranjen.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        //.range(1,50) - return elements from 1-49
        //.rangeClosed(1,50) -return elements from 1.50
        //this is same for IntStream and LongStream but for DoubleStream both of this range and rangeClosed is not supported

        System.out.println("IntStream Range Count : "+IntStream.range(1,50).count());
        IntStream.range(1,50)
                .forEach(value->System.out.print(value + ","));
        System.out.println();

        System.out.println("IntStream RangeClosed Count : "+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50)
                .forEach(value->System.out.print(value + ","));
        System.out.println();

        System.out.println("LongStream Range Count : "+ LongStream.range(1,50).count());
        LongStream.range(1,50)
                .forEach(value->System.out.print(value + ","));
        System.out.println();

        System.out.println("LongStream RangeClosed Count : "+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50)
                .forEach(value->System.out.print(value + ","));
        System.out.println();

        //for double , dont have both so need to convert to doubleAsBelow
        System.out.println("DoubleStream Range Count : "+IntStream.range(1,50).asDoubleStream().count());
        IntStream.range(1,50).asDoubleStream()
                .forEach(value->System.out.print(value + ","));
        System.out.println();

        System.out.println("DoubleStream RangeClosed Count : "+IntStream.rangeClosed(1,50).asDoubleStream().count());
        IntStream.rangeClosed(1,50).asDoubleStream()
                .forEach(value->System.out.print(value + ","));
        System.out.println();
    }

}
