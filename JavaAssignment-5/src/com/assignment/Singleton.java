package com.assignment;

}
public class Singleton {
    private static Singleton s = new Singleton();
    private String str;

    private Singleton() {
    }

    public static Singleton getObject(String a) {
        //str=a;                                       //Non-static member variable cannot be referenced from a static member
        return s;
    }

    public void print() {
        System.out.println(str);
    }
}