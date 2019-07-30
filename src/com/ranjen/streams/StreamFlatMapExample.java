package com.ranjen.streams;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    //same as map() convert one type to another
    //but used in context of stream where each stream element represents multiple element
    //eg. Stream<List> , Stream<Arrays>

    public static List<String> getStudentActivites(){
        List<String> studentActivitiesList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //need to flat the map as above it is still Stream<List<String>>, need to be Stream<String>
                .collect(Collectors.toList()); //once it is one element Stream<String> the only able to pass to collect
        return studentActivitiesList;
    }

    public static void main(String[] args) {
        System.out.println(getStudentActivites());
    }

}
