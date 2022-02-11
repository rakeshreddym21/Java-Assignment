package com.pingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PingDemo {
    public static void CheckPing(String Hostname) {
         String cmd="ping "+Hostname;
        String getInt="";
      ArrayList<Integer>arr=new ArrayList<>();
        try{Process pingProcess = Runtime.getRuntime().exec(cmd);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));
            String reader;
            while ((reader = inputStream.readLine()) != null) {
                if(reader.contains("Reply"))
                {
                    System.out.println(reader);
                   getInt=reader.substring(reader.indexOf("time=") + 5, reader.indexOf("ms"));
                    int n=Integer.valueOf(getInt);
                    arr.add(n);
                }
            }
        }
                catch(IOException e){
                    System.out.println();
        }
        Collections.sort(arr);
        int size= arr.size();
        if(size%2!=0 && size!=0)
        {
            System.out.print("Median of Ping:");
            System.out.println(arr.get(size/2)+"ms");
        }
        else if(size!=0){
            System.out.print("Median of Ping:");
            int avg=(arr.get(size/2)+arr.get(size/2-1))/2;
            System.out.println(avg+"ms");
        }

    }
    public static void main(String[] args)  {

        String HostNAme;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the URL or Ip address : ");
        HostNAme =in.nextLine();
        CheckPing( HostNAme);

    }
}