package com.ranjen.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxMinExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //will set each new value in y.
                //x value hold max value of each element in the iteration
                //first 0 is assinged to x and 6 is assinged to y
                .reduce(0,(x,y)-> x>y? x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                //will set each new value in y.
                //x value hold max value of each element in the iteration
                .reduce((x,y)-> x>y? x:y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y)-> x<y? x:y);
    }

    public static void main(String[] args) {
        //comment and uncomment to playaround
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        //List<Integer> integerList = new ArrayList<>();

        //System.out.println(findMaxValue(integerList));
        System.out.println(findMaxValueOptional(integerList)); //Optional[10]
        //when calculate Max Value always recommended to use Optional because
        //let say the list is empty it will return 0 which is wrong.
        //so we need to stop adding the intial value 0 as in findMaxValue

        Optional<Integer> integerOptionalList = findMaxValueOptional(integerList);
        if(integerOptionalList.isPresent()){
            System.out.println(integerOptionalList.get()); //10
        }else{
            System.out.println("Input list is empty: "+ integerOptionalList);
        }

        //for minValue must use Optional else will give 0 which is the initial value
        //so the initial value must not be set
        List<Integer> integerList2 = Arrays.asList(6,7,8,9,10);
        System.out.println(findMinValueOptional(integerList2)); //Optional[6]

        Optional<Integer> integerOptionalList2 = findMinValueOptional(integerList2);
        if(integerOptionalList2.isPresent()){
            System.out.println(integerOptionalList2.get()); //6
        }else{
            System.out.println("Input list is empty: "+ integerOptionalList2);
        }


    }

}

