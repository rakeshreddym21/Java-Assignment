package com.fileiodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
   public static String characterCount(String inputString)
    {

        Map<Character, Integer> mp = new HashMap<>();      //Hashmap is used here to store character and count
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (mp.containsKey(c)) {                        //If character is already present character count is increased
                mp.put(c, mp.get(c) + 1);
            }
            else {                                          //else character is added with count 1
                mp.put(c, 1);
            }
        }
        inputString="";
        Set <Character> keys=mp.keySet();
        for(char c:keys)
        {
            String s=c+":"+mp.get(c);
            inputString =inputString+s+'\n';  //to store the character and corresponding count in a string
        }
        return inputString;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String input;
        input = args[0];
        PrintWriter p = new PrintWriter(args[0]);
        p.println(characterCount(input));
        p.close();

   }
    }
