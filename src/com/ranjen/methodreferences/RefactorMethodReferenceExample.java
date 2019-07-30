package com.ranjen.methodreferences;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel()>=3;

    public static void main(String[] args) {
        //use get from the studentSupplier created just now
        //returning false as the grade not more than 3
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
