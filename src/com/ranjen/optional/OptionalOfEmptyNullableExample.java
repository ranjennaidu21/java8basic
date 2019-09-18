package com.ranjen.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> optionalString = Optional.ofNullable("Hello");
        return optionalString;
    }

    public static Optional<String> ofNullable2(){
        Optional<String> optionalString = Optional.ofNullable(null);
        return optionalString;
    }

    public static Optional<String> ofNullable3(){
        Optional<String> optionalString = Optional.ofNullable("Hello");
        return optionalString;
    }

    public static Optional<String> of(){
        Optional<String> optionalString = Optional.of(null);
        return optionalString;
    }

    public static Optional<String> of2(){
        Optional<String> optionalString = Optional.of(null);
        return optionalString;
    }

    public static Optional<String> of3(){
        Optional<String> optionalString = Optional.of(null);
        return optionalString;
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        //use ofNullable when you think its not going to be valid String all the time, return Optional.empty when
        //value is null
        System.out.println(ofNullable().get());
        System.out.println(ofNullable2());
        System.out.println(ofNullable3().isPresent());

        //of always expect the value will be returned. If not throw null pointer exception
        //System.out.println(of().get());
        //System.out.println(of2());
        //System.out.println(of3().isPresent());

        //can return empty to be used in exception block or if want to return empty Optional object
        System.out.println(empty());
    }

}
