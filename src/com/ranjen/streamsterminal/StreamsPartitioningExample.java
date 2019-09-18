package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningExample {
    //partitioningBy - kindOfGroupingBY , accept predicate as input ,
    //output is Map<K,V> and key always return as Boolean
    //two version , one with (predicate) param another one (predicate,downstream) param

    public static void partitioningBy_1(){
        Predicate<Student> predicate1 = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate1));
        System.out.println(studentMap);
    }

    //send two argument , instead of list above , output as Set
    public static void partitioningBy_2(){
        Predicate<Student> predicate1 = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate1,toSet()));
        System.out.println(studentMap);
    }



    public static void main(String[] args) {
        //whatever meet the predicate will fall under true key , else will fall under false key
        partitioningBy_1();
        partitioningBy_2();
    }
}
