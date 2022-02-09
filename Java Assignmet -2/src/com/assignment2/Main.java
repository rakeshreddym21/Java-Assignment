package com.assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static int removeDuplicates(String s)
    {
        HashSet <Character> set
                = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++)                    //Set doesn't contain duplicate characters
        {
            set.add(s.charAt(i));
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str;
       System.out.println("Enter the input:");                   //EX: The quick brown fox jumps over the lazy dog$sdbsbs
       str=input.nextLine();
        str=str.toLowerCase();                                   //To make case-insensitive

        str=str.replaceAll("[^a-z]","");         //To remove all other characters except for alphabets

        int size=removeDuplicates(str);

        if(size==26)
        {
            System.out.println("All alphabets are present");
        }
        else{
            System.out.println("All alphabets are not present");
        }
    }
}
