package com.ranjen.interfaces;

public class Client14 implements Interface1,Interface4{

    //if both interface 1,4 have same method signature for methodA , there will be conflict so to solve that
    //need to override the method in this implementation class
    public void  methodA(){
        System.out.println("Inside method A "+Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();

    }

}