package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {



    static Function<List<Student>, Map<String,Double>> function = (students)->{
        Map<String,Double> studentMap = new HashMap<>();
        students.forEach((student)->{
            studentMap.put(student.getName(),student.getGpa());
        });
        return studentMap; //this should return map

    };


    public static void main(String[] args) {
        System.out.println("Result is: " + function.apply(StudentDataBase.getAllStudents()));
    }

}
