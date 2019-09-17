package com.ranjen.streamsterminal;

import com.ranjen.data.Student;
import com.ranjen.data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        //to get sum and average of all the notebooks quantity of all the Students
        //summingInt - this collector return sum as a result
        //averagingInt - this collector return average as a result
        //support long and double as well
        System.out.println(sum());
        System.out.println(average());
    }

}
