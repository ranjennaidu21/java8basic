package com.ranjen.lambdas;

import java.util.Comparator;

public class ComparatorLambda {

    public static int compareTwoIntegers(Comparator<Integer> comparator, int a, int b){

        return comparator.compare(a,b);
    }

    public static void main(String[] args) {

        /**
         * Prior JAVA 8
         */
        Comparator<Integer> comparator  = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> if both are equal
                // 1 -> if o1 > o2
                //-1 -> if o1<o2
            }
        };

        System.out.println("The value of comparator: " +comparator.compare(1,2));

        /**
         * In JAVA 8
         */

/*        Comparator<Integer> comparatorLambda = (o1,o2)->{
            return o1.compareTo(o2);
        };*/

        //since one statement dont need curly braces and return
        //LAMBDA also intelligent to know it accept integer as param because we mentioned<Integer>
        Comparator<Integer> comparatorLambda = (o1,o2)-> o1.compareTo(o2);

        System.out.println("The value of comparatorLambda: " + comparatorLambda.compare(1,2));

    }

}
