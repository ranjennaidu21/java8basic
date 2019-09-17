package com.ranjen.streamsterminal;

import com.ranjen.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    //counting() - return total number of elements as a result
    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
