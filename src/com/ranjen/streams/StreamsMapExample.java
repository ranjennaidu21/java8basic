package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    //map method used to convert from one type to another type

    //let say we wanted to get all the students name
    //input Student object , output is List of Strings
    public static List<String> getStudentNames(){
        List<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                //now let say wanted to some operation with the input
                .map(String::toUpperCase)// Stream<String> - upperCase operation on each Input
                .collect(Collectors.toList()); //List<String>
        return studentList;
    }

    //if we wanted to return as Set instead of List above
    public static Set<String> getStudentSet(){
        Set<String> studentSet = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                //now let say wanted to some operation with the input
                .map(String::toUpperCase)// Stream<String> - upperCase operation on each Input
                .collect(Collectors.toSet()); //List<String>
        return studentSet;
    }
    public static void main(String[] args) {
        System.out.println(getStudentNames());
        System.out.println(getStudentSet());
    }


}
