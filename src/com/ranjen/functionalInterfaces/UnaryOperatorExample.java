package com.ranjen.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //when to use instead of Function interface which this extended from: when input and output same type
    static UnaryOperator<String> uop = (s)-> s.concat("Default");

    public static void main(String[] args) {
        System.out.println("Result is: "+ uop.apply("java8"));
    }
}
