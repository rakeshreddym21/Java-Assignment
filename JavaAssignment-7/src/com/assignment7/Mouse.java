package com.assignment7;

public class Mouse extends  Rodent {
    @Override
    public void run() {
        System.out.println("Mouse is Running");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }
    Mouse(){
        System.out.println("This is mouse");
    }
}
