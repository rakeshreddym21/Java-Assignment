package com.Error;

public class Example1 {
    public static void main(String[] args) {
        int i,j,k;
        j=0;
        i=5;
        try{
        k=i/j;
        System.out.println(k);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            e.getMessage();
        }
    }
}
