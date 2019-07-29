package com.ranjen.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {


    //when to use instead of BiFunction interface which this extended from: accept 2 input and return one output-
    //use when input and output same type
    static Comparator<Integer> comparator = (a,b)->a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> bo = (a,b)-> a*b;
        System.out.println(bo.apply(4,5));

        //maxBy using needed Comparator
        BinaryOperator<Integer> maxValue =  BinaryOperator.maxBy(comparator);
        System.out.println("Result of maxValue is: " + maxValue.apply(5,10));

        //minBy using needed Comparator
        BinaryOperator<Integer> minValue = BinaryOperator.minBy(comparator);
        System.out.println("Result of minValue is: " + minValue.apply(26,32));

    }

}
