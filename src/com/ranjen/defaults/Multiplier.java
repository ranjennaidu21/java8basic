package com.ranjen.defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Default method Inside interface: ");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){
        return integerList==null && integerList.size()==0;
    }

}
