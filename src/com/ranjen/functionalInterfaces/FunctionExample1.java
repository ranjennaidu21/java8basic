package com.ranjen.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample1 {

    //use the function interface using the variable from FunctionExample
    static String performConcat(String str){
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println("Result is: "+result);
    }

}
