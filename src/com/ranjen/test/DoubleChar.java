package com.ranjen.test;
import org.apache.commons.lang3.StringUtils;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("A"));
    }

    public static String doubleChar(String characthers){
        return StringUtils.repeat(characthers, 2);
    }

}
