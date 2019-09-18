package com.ranjen.optional;

import com.ranjen.data.Bike;
import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent
                .filter(student -> student.getGpa()>=4.0)
                .ifPresent((student)->System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> optionalStudentName = optionalStudent
                .filter(student -> student.getGpa()>=3.5)
                .map(Student::getName);
        System.out.println(optionalStudentName.get());
    }

    //flatMap - let say Bike is Optional where it some student have and some not have,
    //to filter optional object inside another optional object we use flatMap
    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> optionalBikeName = optionalStudent
                .filter(student -> student.getGpa()>=3.5) //Optional<Student> . Optional<Bike>
                .flatMap(Student::getBike) //returns -> Optional<Bike>
                .map(Bike::getName); //Optional<String>
        optionalBikeName.ifPresent((s)-> System.out.println("Bike Name: "+ s));
    }

    public static void main(String[] args) {
        optionalFilter(); //student gpa is not more than 4.0 so not present ,so will not print anything
        optionalMap();
        optionalFlatMap();
    }

}
