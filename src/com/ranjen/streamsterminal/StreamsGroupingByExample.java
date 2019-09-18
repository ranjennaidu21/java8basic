package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

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

    //type2 using 2 parameter where goup by gradeLevel first , then with gpa, First one return integer for gradelevel
    //and second one is map<String,List<Student>>
    public static void twoLevelGrouping_1(){
        Map<Integer,Map<String, List<Student>>> studentMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel,
                                groupingBy(student -> student.getGpa()>=3.8? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<Integer,Integer> studentMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel, //return int
                                summingInt(Student::getNotebooks))); //return int
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_3(){
        Map<String,Integer> studentMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getName, //return String
                                summingInt(Student::getNotebooks))); //return int
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGrouping();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        twoLevelGrouping_3();
    }

}
