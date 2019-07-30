package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        //get student name and activities in map
        System.out.println("Student Map");
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Result is" +studentMap);


        //apply filter
        System.out.println("Student Map with filter");
        Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel()>=3))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Result is" +studentMap2);

        //use predicate as filter
        System.out.println("Student Map with filter using Predicate");
        Predicate<Student> studentGradePredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> studentMap3 = StudentDataBase.getAllStudents().stream()
                .filter(studentGradePredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Result is" +studentMap3);

    }

}
