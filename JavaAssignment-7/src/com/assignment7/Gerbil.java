package com.assignment7;

public class Gerbil extends Rodent{
    @Override
    public void run() {
        System.out.println("Gerbil is Running");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }
    Gerbil(){
        System.out.println("This is Gerbil");
    }
}
