package com.ranjen.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        //using Predicate to check if that number is even or not using test method

        Predicate<Integer> p = (i) ->{
            return (i%2==0);
        };

        System.out.println(p.test(4));

        //You can simplify the above as below if it is single statement

        Predicate<Integer> p1 = (i) -> i%2==0;
        System.out.println(p1.test(8));

    }

}
