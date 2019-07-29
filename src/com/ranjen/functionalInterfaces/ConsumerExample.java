package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c = (s)->System.out.println(s.toUpperCase());

        c.accept("java8");

        Consumer<Student> c2 = (student)->System.out.println(student);

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2); //it accepting Consumer Implementation, so we create one above
    }

}
