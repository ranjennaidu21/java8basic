package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findAny();
    }

    public static void main(String[] args) {
        //diff with match is that return boolean but this return element itself
        //both findAny and findFirst did not return all the element, as long it able to find any or first
        //it return only one element.
        Optional<Student> firstElement = findFirst();
        if(firstElement.isPresent()){
            System.out.println(firstElement.get());
        }else{
            System.out.println("No Student is found");
        }

        Optional<Student> anyElement = findAny();
        if(anyElement.isPresent()){
            System.out.println(anyElement.get());
        }else{
            System.out.println("No Student is found");
        }

    }

}
