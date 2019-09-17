package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) //Stream<String>
                .collect(joining());
    }

    public static String joining_2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) //Stream<String>
                .collect(joining("-"));
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) //Stream<String>
                .collect(joining("-","(",")"));
    }

    public static void main(String[] args) {
        //Terminal Operations - collect the data for you and start the whole stream pipeline

        //joining - perform concatination on elements in the stream with 3 different overloaded versions of joining

        //version1 - raw join
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
        //version2 - with delimiter

        //version3 - with delimiter , prefix and suffix
    }

}
