package com.ranjen.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    //need to be static
    static int value= 4;

    public static void main(String[] args) {

        //not able to use same local variable in the method scope
        int i=0;

        //cannot use i
        Consumer<Integer> consumer = (i1)->{

            //also cannot use same i inside
            //i=2;
            System.out.println("Value is: "+i1);
        };


        //cannot put here
        //int value= 4;
        Consumer<Integer> consumer1 = (j)->{
            value++;
          System.out.println(value+j);
        };

        consumer1.accept(4);
    }

}
