package com.ranjen.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    //using Predicate to check if that number is even or not using test method

    static Predicate<Integer> p = (i) ->{return (i%2==0);};

    //You can simplify the above as below if it is single statement
    static Predicate<Integer> p1 = (i) -> i%2==0;

    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void main(String[] args) {

        System.out.println(p.test(4));

        System.out.println(p1.test(8));

        predicateAnd();
        predicateOr();
        predicateNegate();

    }

    //return true if both true
    public static void predicateAnd(){
        System.out.println("predicateAnd result is: "+ p1.and(p2).test(10));
        System.out.println("predicateAnd Value is: "+ p1.and(p2).test(8));
    }
    //return true if either one is true
    public static void predicateOr(){
        System.out.println("predicateOr result is: "+ p1.or(p2).test(10));
        System.out.println("predicateOr Value is: "+ p1.or(p2).test(8));
    }

    //give the opposite result , if true return false and vice versa
    public static void predicateNegate(){
        System.out.println("predicateNegate result is: "+ p1.or(p2).negate().test(10));
        System.out.println("predicateNegate Value is: "+ p1.or(p2).negate().test(8));
    }

}
