package com.ranjen.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsvsStreams {

    public static void main(String[] args) {

        //Collections 1. can add/modify/remove elements
        //2.can access in any order but stream accessed only in sequence

        ArrayList<String> names = new ArrayList<>();
        names.add("jill");
        names.add("jung");
        names.add("juck");
        names.remove(0);

        //3. COllection can be traversed number of times and perform external iteration
        for(String name:names){
            System.out.println(name);
        }

        //can iterate elements multiple times
        for(String name:names){
            System.out.println(name);
        }

        System.out.println(names);
        //For Stream cannot add , modify or remove elements. It is fixed
        //no method for add,remove or modify
        //names.stream().?

        //3. Stream can be traversed only once and perform internal iteration
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println); //cannot again , will give compilation error
    }

}
