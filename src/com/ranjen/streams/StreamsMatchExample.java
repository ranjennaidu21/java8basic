package com.ranjen.streams;

import com.ranjen.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>4.0);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>4.1);
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match: " + allMatch()); //true if all record match
        System.out.println("Result of All Match: " + anyMatch()); //true if any match
        System.out.println("Result of All Match: " + noneMatch()); //true if none match
    }

}
