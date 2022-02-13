package com.assignment7;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodentType=new Rodent[3];
        rodentType[0]=new Gerbil();
        rodentType[1]=new Mouse();
        rodentType[2]=new Hamster();
        rodentType[1].eat();


    }
}
