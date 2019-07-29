package com.ranjen.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    //first <> is input and second is output, so accept String and return string
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        //apply method
        System.out.println("Result is: " + function.apply("java8"));

        //andThen method - will do in order apply function first then that result put in addSomeString
        System.out.println("Result is: " + function.andThen(addSomeString).apply("java8"));

        //compose , first do the value passed in param addSomeString using apply first, then that result used in the function
        System.out.println("Result is: " + function.compose(addSomeString).apply("java8"));
    }

}
