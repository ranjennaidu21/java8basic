package com.ranjen.interfaces;

public interface Interface1 {
    //3
    default void methodA(){

        System.out.println("Inside Method A" + Interface1.class);
    }
}
