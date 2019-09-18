package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

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

    //Type 3 - first is the key, second is what kind of collection it going to return (LinkedHashMap) , third is what is the value
    //of the output that is going to generate
    public static void threeArgumentGroupBy(){
        LinkedHashMap<String,Set<Student>> studentLinkedHashMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getName, //key
                                LinkedHashMap::new, //output collection
                                toSet())); //value of the output
        System.out.println(studentLinkedHashMap);
    }


    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGrouping();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        twoLevelGrouping_3();
        threeArgumentGroupBy();
    }

}
