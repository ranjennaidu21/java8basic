package com.ranjen.interfaces;

public interface Interface4 {

    default void methodA(){
        System.out.println("Inside method A"+Interface4.class);
    }
}