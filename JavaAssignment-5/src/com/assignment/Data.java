package com.assignment;

public class Data {
    private int integer;
   private char character;
    public void print()
    {
        System.out.println(integer);
        System.out.println(character);
    }
    public void printLocal()
    {
        int i;
         char c;
      /* System.out.println(i);          //Local variables doesn't have default value and local variables needs
       System.out.println(c);       */  //to be initialized

    }
}
