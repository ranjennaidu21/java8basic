package com.ranjen.optional;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    //avoid null pointer exception and unnecessary null check

    public static String getStudentName(){
        //Student student =  StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        //Optional<Student> studentOptional = Optional.of(StudentDataBase.studentSupplier.get()); //.of take Student object and wrap into optional object
        Optional<Student> studentOptional = Optional.ofNullable(null); //this going to return Optional.empty();
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName); //Stream<String>
        }
        return Optional.empty(); //represent an Optional Object with no value
    }

    public static void main(String[] args) {
        String name = getStudentName();
        //this will give null pointer exception as no handling for null here
        //System.out.println("Length of the student name: "+name.length());

        //so need to handle null here
        if(name!=null){
            System.out.println("Length of the student name: "+name.length());
        }else{
            System.out.println("Name not found");
        }

        //for Optional we dont have to check the null
        Optional<String> optionalName = getStudentNameOptional();

        //the difference is that you still can execute method in the empty optional Object
        //even optionalName return empty but still we can check the value inside it is present or not
        //above null not belong to any type but for this method always return Optional type
        if(optionalName.isPresent()){
            System.out.println("Length of the student name: "+optionalName.get().length());
        }else{
            System.out.println("Name not found");
        }

    }

}
