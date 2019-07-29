package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    //different with consumer as this doesn't take any input but return output
    public static void main(String[] args) {

        //return single student object
        Supplier<Student> studentSupplier = ()->{
          return new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        };

        System.out.println("Student is: " +studentSupplier.get());

        //return students list
        Supplier<List<Student>> studentList = ()-> StudentDataBase.getAllStudents();
        System.out.println("Students are: " +studentList.get());

    }

}
