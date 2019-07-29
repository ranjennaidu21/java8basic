package com.ranjen.functionalInterfaces;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    //BiFunction first two is input and third one is output
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> bf1 = (studentList,studentPredicate)->{
        Map<String,Double> studentMap = new HashMap<>();
        studentList.forEach((student)->{
            if(studentPredicate.test(student)){
                studentMap.put(student.getName(),student.getGpa());
            }
        });
        return  studentMap;
    };
    public static void main(String[] args) {
        //use the p1 predicate where filter student gradeLevel >= 3
        System.out.println(bf1.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p1));
    }

}
