package com.ranjen.optional;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent
                .filter(student -> student.getGpa()>=4.0)
                .ifPresent((student)->System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> optionalStudentName = optionalStudent
                .filter(student -> student.getGpa()>=3.5)
                .map(Student::getName);
        System.out.println(optionalStudentName.get());
    }

    //flatMap


    public static void main(String[] args) {
        optionalFilter(); //student gpa is not more than 4.0 so not present ,so will not print anything
        optionalMap();
    }

}
