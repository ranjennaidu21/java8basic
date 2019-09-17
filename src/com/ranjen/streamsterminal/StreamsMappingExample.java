package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {
        //mapping() - apply transformation function first then collect the data in collection
        //previously we use .map and then .collect method. by using this we can skip the one line of map

    List<String> studentNameList = StudentDataBase.getAllStudents()
            .stream().collect(mapping(Student::getName,toList()));

    System.out.println("nameList: " +studentNameList);

    Set<String> studentNameSet = StudentDataBase.getAllStudents()
            .stream().collect(mapping(Student::getName,toSet()));

    System.out.println("nameSet: " +studentNameSet);
    }

}
