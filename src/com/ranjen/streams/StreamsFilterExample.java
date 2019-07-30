package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    //filter() - to filter stream and input is Predicate Functional Interface

    //filter by female and gpa is more than 3.8

    public static List<Student> getFemaleBestListStudents(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGender().equals("female"))//Stream<Student> where gender is female
                .filter(student -> student.getGpa()>=3.8) //add another filter where gpa is >= 3.8
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        getFemaleBestListStudents().forEach(System.out::println);
    }
}
