package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import javax.rmi.CORBA.StubDelegate;

public class StreamsFilterMapReduceExample {

    //get total number of notebooks of all the students
    public static int numberOfNotebooks(){
        int noOfNotebooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3) //to add filter
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                //.reduce(0,(a,b)->a+b);
                //instead of above can simpilfy using Integer sum method as below
                .reduce(0,Integer::sum);

        return noOfNotebooks;
    }
    public static void main(String[] args) {
        System.out.println(numberOfNotebooks());
    }

}
