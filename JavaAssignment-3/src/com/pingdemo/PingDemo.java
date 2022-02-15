package com.pingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PingDemo {
    public  void CheckPing(String Hostname,String Requests) throws IOException {
        String cmd="ping "+"-n "+Requests+" "+Hostname;             //Ping command
        String getInt="";
        ArrayList<Integer> arr=new ArrayList<>();
        Process pingProcess = Runtime.getRuntime().exec(cmd);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));
        String lineReader;
        while ((lineReader = inputStream.readLine()) != null) {
            if(lineReader.contains("time="))
            {
                System.out.println(lineReader);
                getInt=lineReader.substring(lineReader.indexOf("time=") + 5, lineReader.indexOf("ms"));
                int n=Integer.valueOf(getInt);
                arr.add(n);                         //Storing the time in integer arraylist
            }
        }
        Collections.sort(arr);
        int size= arr.size();                    //Getting median
        if(size%2!=0 && size!=0)
        {
            System.out.print("Median of time taken to Ping:");
            System.out.println(arr.get(size/2)+"ms");
        }
        else if(size!=0){
            System.out.print("Median of time taken to Ping:");
            int avg=(arr.get(size/2)+arr.get(size/2-1))/2;
            System.out.println(avg+"ms");
        }
        else{
            System.out.println("warning:enter correct url address or not able to ping the host ");
        }

    }
}
