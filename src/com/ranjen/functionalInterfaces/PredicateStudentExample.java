package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s)-> s.getGpa()>=3.9;

    public static void main(String[] args) {
        filterStudentByGrade();
        filterStudentByGpa();
        filterStudents();
    }

    public static void filterStudentByGrade(){
        System.out.println("filterStudentByGrade()");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student)->{
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa(){
        System.out.println("filterStudentByGpa()");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student)->{
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    //to filter both grade and gpa
    public static void filterStudents(){
        System.out.println("filterStudentsByGradeAndGpa()");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student)->{
            if(p1.and(p2).test(student)){ //can use or , negate method as well
                System.out.println(student);
            }
        });
    }

}
