package com.ranjen.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    //ParallelStream uses Fork/Join framework introduced in Java 7
    //number of threads created = number of processors available in machine

    public static long checkPerformanceResult(Supplier<Integer> sum , int numberOfTimes){

        long start = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            sum.get();
        }

        long end = System.currentTimeMillis();
        return end-start;
    }

    public static int sum_sequential_stream(){

        int total = IntStream.rangeClosed(1,1000000)
                .sum();
        return total;

    }

    public static int sum_parallel_stream(){

        int total = IntStream.rangeClosed(1,1000000)
                .parallel() // splits the data in to multiple parts //775057
                .sum();//performs the sum of the individual parts and consolidate the result.
        return total;
    }

    public static void main(String[] args) {

        //Check for available processors in this machine
        System.out.println(Runtime.getRuntime().availableProcessors());

        long sequentialDuration = checkPerformanceResult(ParallelStreamExample::sum_sequential_stream,20);
        System.out.println("sequentialDuration in MilliSeconds: " + sequentialDuration);

        long parallelDuration =checkPerformanceResult(ParallelStreamExample::sum_parallel_stream,20);
        System.out.println("parallelDuration in MilliSeconds: " + parallelDuration);

    }

}
