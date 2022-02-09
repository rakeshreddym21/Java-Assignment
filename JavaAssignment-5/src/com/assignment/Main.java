package com.assignment;

public class Main {

    public static void main(String[] args) {
        Data d=new Data();
        d.print();
        Singleton s= Singleton.getObject("abc");
        s.print();
    }
}
