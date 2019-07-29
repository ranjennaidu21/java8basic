package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    //create predicate with filter
    Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s)-> s.getGpa()>=3.9;

    //use biconsumer to print the student name and activites
    BiConsumer<String,List<String>> studentConsumer = (name,activities)-> System.out.println(name + ":" + activities);

    //use consumer to filter based on the predicate
    Consumer<Student> c1 = (student)->{
        if(p1.and(p2).test(student)){
            studentConsumer.accept(student.getName(),student.getActivities());
        }
    };

    //this time try instance method. lambda react the same for instance/static method
    public void printNameAndActivities(List<Student> students){
        students.forEach(c1);
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }




}
