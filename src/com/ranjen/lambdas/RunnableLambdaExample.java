package com.ranjen.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda
        // ()->{}

        //for multiple statement need curly braces
        Runnable runnableLambda2 = () -> {
            System.out.println("Inside Runnable 2");
            System.out.println("Inside Runnable 3");
        };
        new Thread(runnableLambda2).start();

        //for single line dont need curly braces as below
        Runnable runnableLambda3 = () -> System.out.println("Inside Runnable 4");
        new Thread(runnableLambda3).start();

        //we can simplify more if didnt one to store the runnable value as below
        new Thread(()->{System.out.println("Inside Runnable 5");}).start();






   }

}
