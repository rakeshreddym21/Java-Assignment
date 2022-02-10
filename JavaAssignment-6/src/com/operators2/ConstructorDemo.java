package com.operators2;

public class ConstructorDemo {
    public ConstructorDemo(int n){
         this("Hello");
        System.out.println(n);
    }

    public ConstructorDemo(String s){
        System.out.println(s);

    }
}
