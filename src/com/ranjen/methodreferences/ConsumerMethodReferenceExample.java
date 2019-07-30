package com.ranjen.methodreferences;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //using lambda
    static Consumer<Student> consumer = (student)->System.out.println(student);
    //using method reference
    /**
     * Class::instancemethod
     */
    static Consumer<Student> consumer2 = System.out::println;
    /**
     * instance::instancemethod - new method created in Student
     */
    static Consumer<Student> consumer3 = Student::printListOfActivities;


    public static void main(String[] args) {
        System.out.println("Lambda test");
        StudentDataBase.getAllStudents().forEach(consumer);
        System.out.println("Class::instancemethod");
        StudentDataBase.getAllStudents().forEach(consumer2);
        System.out.println("instance::instancemethod");
        StudentDataBase.getAllStudents().forEach(consumer3);
    }

}
