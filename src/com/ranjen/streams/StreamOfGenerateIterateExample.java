package com.ranjen.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        //of - create stream of certain values passed to this method
        System.out.println("Of Method");
        Stream<String> streamString = Stream.of("adam","dan","nanny");
        streamString
                .limit(5)
                .forEach(System.out::println);

        //iterate - used to create infinite streams
        //if didnt use limit it will print 0 after maximum Integer value
        System.out.println("Iterate Method");
        Stream.iterate(1,x->x*2)
                .limit(5)
                .forEach(System.out::println);

        //generate // take supplier which didnt take input put return output
        System.out.println("Generate Method");
        Supplier<Integer> randomInteger = new Random()::nextInt;
        Stream.generate(randomInteger)
                .limit(5)
                .forEach(System.out::println);
    }
}
