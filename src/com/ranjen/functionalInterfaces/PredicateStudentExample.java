package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3.6;

    public static void main(String[] args) {
        filterStudentByGrade();
    }

    public static void filterStudentByGrade(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student)->{
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

}
