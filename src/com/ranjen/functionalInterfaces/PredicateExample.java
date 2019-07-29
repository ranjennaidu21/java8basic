package com.ranjen.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    //using Predicate to check if that number is even or not using test method

    static Predicate<Integer> p = (i) ->{return (i%2==0);};

    //You can simplify the above as below if it is single statement
    static Predicate<Integer> p1 = (i) -> i%2==0;

    public static void main(String[] args) {

        System.out.println(p.test(4));

        System.out.println(p1.test(8));

    }

}
