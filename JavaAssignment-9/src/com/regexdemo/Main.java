package com.regexdemo;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pat="^[A-Z][a-zA-Z0-9_-]*[.]$";                              //Regex Pattern to check sentence starting
        //String pat = "[A-Z]{1}[[\\w][\\d][\\s][\\S][\\W][\\D]]*[\\.]{1}"; //with Capital letter and ending with period(.)
        String in;
        while (true) {
            System.out.println("Enter the Sentence or 0 to exit code:");
            in = input.nextLine();
            if(in.equalsIgnoreCase("0"))         //to exit code
            {
                break;
            }
            boolean a = Pattern.matches(pat, in);          //To check whether sentence matches with given pattern
            if (a == true) {
                System.out.println("The sentence is entered in  correct format.");
            } else {
                System.out.println("The sentence is entered in incorrect format");
            }
        }
    }
}