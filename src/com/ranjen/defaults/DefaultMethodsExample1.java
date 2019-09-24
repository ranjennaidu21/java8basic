package com.ranjen.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample1 {

    public static void main(String[] args) {
        //Default method- using default keyword in interface, can be overriden in implementation class
        //help without having any impact with current process that implement interface
        //Static method- similar to default but cannot be overriden in implementation class


        //Sort the listnames in alphabetical order

        List<String> stringList = Arrays.asList("Jenny","Dan","Cynthia","Zebra","Orange");

        //prior to Java 8
        Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort : " +stringList);

        //Java 8 using default method
        //ascending
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List sort: "+stringList);
        //descending
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List sort reverse: "+stringList);
    }

}
