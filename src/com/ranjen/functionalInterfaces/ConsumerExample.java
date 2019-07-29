package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<String> c = (s)->System.out.println(s.toUpperCase());
    static Consumer<Student> c2 = (student)->System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        c.accept("java8");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2); //it accepting Consumer Implementation, so we create one above

        printNameAndActivities();

    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); //use andThen to run another consumer Implementation - called Consumer Chaining
    }

}
