package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    //reduce is terminal operation like collect where used to reduce the content of stream to a single value
    //eg: find sum of all element, multiplication of all element, find who highest grade student
    //take 2 param input , 1st default/intial value , 2nd is BinaryOperator<T>


    //now let get the sum of multiplication of all element
    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
                //what this do is first take 1 as intial value , then first b are elements from list
                //then take the result and put in a, then b will be 3
                //so a is result , b is value from list
                //1*1=1
                //1*3=3
                //3*5=15
                //15*7=105
    }

    //if let say we didn't want to put the initial value as 1. need to make it Optional<Integer>
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->a*b);
        //what this do is first take 1 as intial value , then first b are elements from list
        //then take the result and put in a, then b will be 3
        //so a is result , b is value from list
        //1*1=1
        //1*3=3
        //3*5=15
        //15*7=105
    }


    //reduce to student who have highest gpa in this whole Student collection
    public static Optional<Student> getHighestGpaStudent(List<Student> studentList){
        return studentList.stream()
                .reduce((s1,s2)-> s1.getGpa()>s2.getGpa()? s1:s2); //if s1>s2 return s1 else return s2
    }

    public static void main(String[] args) {
        System.out.println("Perform Multiplication with InitialValue");
        List<Integer> myIntegerList = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(myIntegerList));
        Optional<Integer> myIntegerListWithoutIdentity = performMultiplicationWithoutIdentity(myIntegerList);

        //for Optional need to use get and check if value is present
        System.out.println("Perform Multiplication without InitialValue");
        if(myIntegerListWithoutIdentity.isPresent()){
            System.out.println(myIntegerListWithoutIdentity.isPresent());
            System.out.println(myIntegerListWithoutIdentity.get());
        }

        System.out.println("Get Highest GPA Student");
        Optional<Student> optionalStudent = getHighestGpaStudent(StudentDataBase.getAllStudents());
        if(optionalStudent.isPresent()){
            System.out.println(optionalStudent.get());
        }
    }

}
