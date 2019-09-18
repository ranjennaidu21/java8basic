package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamsGroupingByExample {
    //group the element based on a property
    //the output of groupingby() is going to be Map<K,V>

    public static void groupStudentsByGender(){
        //since gender is String , the key will be in String
        Map<String, List<Student>> studentMap =
                StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    //if gpa greater than 3.8 grouped as OUTSTANDING students , else grouped as AVERAGE students.
    public static void customizedGrouping(){
        Map<String, List<Student>> studentMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(student -> student.getGpa()>=3.8? "OUTSTANDING":"AVERAGE"));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGrouping();
    }

}
