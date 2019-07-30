package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    //objective: the whole student records need to ordered based on name in alphabetical order

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //gpa in ascending order
    public static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    //gpa in descending order
    public static List<Student> sortStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()) //by adding reversed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort Students by Name");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Sort Students by Gpa");
        sortStudentByGpa().forEach(System.out::println);
        System.out.println("Sort Students by Gpa Descending");
        sortStudentByGpaDesc().forEach(System.out::println);
    }

}
