package com.ranjen.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("helloString");

        //isPresent - only will check if value present or not
        System.out.println(stringOptional.isPresent());
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }

        //ifPresent - similiar to isPresent but give additional one logic where you can use that returned value (eg:a)
        //and perform any kind of operation (call other method or service) you want using consumer
        stringOptional.ifPresent((a)->System.out.println(a));

    }

}
