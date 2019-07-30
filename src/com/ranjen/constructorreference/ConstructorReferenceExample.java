package com.ranjen.constructorreference;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    //Student class should have empty constructor , if not create it else will give compilation error

    //need to have empty Student constructor
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentFunction = Student::new;



    public static void main(String[] args) {
    //create new Student object with all null or default values
        System.out.println(studentSupplier.get());

    //create new Student object by set Name only
        //this will refer to the Student constructor which accept one String
        System.out.println(studentFunction.apply("Ranjen"));
    }

}
