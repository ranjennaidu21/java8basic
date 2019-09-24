package com.ranjen.defaults;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);

    static Comparator<Student> gradeLevelComparator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    public static void sortByName(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList){
        //use comparingDouble to compare double value
        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        //use comparingDouble to compare double value
        studentList.sort(gradeLevelComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        System.out.println("Before Sort: ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);

        System.out.println("After Sort by Name: ");
        sortByName(studentList);

        System.out.println("After Sort by Gpa: ");
        sortByGpa(studentList);

        System.out.println("Using ComparatorChaining by Grade Level then Name: ");
        comparatorChaining(studentList);
    }

}
