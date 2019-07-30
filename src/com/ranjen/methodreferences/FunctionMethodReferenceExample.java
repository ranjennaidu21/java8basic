package com.ranjen.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    //method reference is simplify of lambda expression itself

    //using lambda
    static Function<String,String> toUpperCaseLambda = (s) -> s.toUpperCase();
    //using method reference
    //can use alt+enter replace lambda with method reference , - dont need to put input in bracket
    static Function<String,String> toUpperMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println("Result for upperCaseLambda: " + toUpperCaseLambda.apply("java8"));
        System.out.println("Result for toUpperMethodReference: " + toUpperMethodReference.apply("java8"));
    }

}
