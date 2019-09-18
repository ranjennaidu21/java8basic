package com.ranjen.optional;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse -accept the actual value
    public static String orElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElse("DEFAULT");
        //If the value not present will return DEFAULT
    }

    //orElseGet - use supplier, didnt take any input but will return output
    public static String orElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseGet(()->"DEFAULT");
        //If the value not present will return DEFAULT
    }

    //orElseThrow - use supplier and throw exception
    public static String orElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No data found"));
        //If the value not present will throw exception
    }

    public static void main(String[] args) {
        System.out.println(orElse());
        System.out.println(orElseGet());
        System.out.println(orElseThrow());
    }

}
