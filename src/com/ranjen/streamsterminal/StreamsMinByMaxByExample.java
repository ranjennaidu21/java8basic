package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    //get student with lowest gpa
    public static Optional<Student> minByExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    //get student with highest gpa
    public static Optional<Student> maxByExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        //Comparator as input and Optional as output
        System.out.println(minByExample());
        System.out.println(maxByExample());
    }

}
