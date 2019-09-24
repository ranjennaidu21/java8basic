package com.ranjen.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> inputList = Arrays.asList(1,3,5);
        System.out.println("Result is : " + multiplier.multiply(inputList));
        //default method in interface can be overriden with the one in Impl class
        System.out.println("Default method is : " + multiplier.size(inputList));
        //for static method we need to use the interface directly instead of the class
        //this cannot be overridden in Impl class
        System.out.println("Static method is : " + Multiplier.isEmpty(inputList));
    }

}
