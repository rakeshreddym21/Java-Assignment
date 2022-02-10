package com.fileiodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static String characterCount(String inputString) {

        Map<Character, Integer> mp = new HashMap<>();      //Hashmap is used here to store character and count
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (mp.containsKey(c)) {                        //If character is already present character count is increased
                mp.put(c, mp.get(c) + 1);
            }
            else {                                          //else character is added with count 1
                mp.put(c, 1);
            }
        }
        inputString = "";
        Set<Character> keys = mp.keySet();
        for (char c : keys) {
                String s = c + ":" + mp.get(c);               //to store the character and corresponding count in a string
                inputString = inputString + s + '\n';
            }
            return inputString;
        }

        public static void main (String[] args) throws FileNotFoundException {            //Mississippi
                for(String s:args) {
                PrintWriter p = new PrintWriter(s);
                p.println(characterCount(s));
                p.close();
            }
        }
    }

