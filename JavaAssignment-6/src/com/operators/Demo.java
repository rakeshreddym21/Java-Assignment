package com.operators;

import java.util.Scanner;


public class Demo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of vampire numbers to printed:");
        n=input.nextInt();
         VampireNumbers v=new VampireNumbers();
         v.PrintVampireNumbers(n);

    }
}












