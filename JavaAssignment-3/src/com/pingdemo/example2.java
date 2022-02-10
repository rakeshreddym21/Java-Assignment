package com.pingdemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) throws IOException {

        Scanner input=new Scanner(System.in);
        int n;
        String serverName;
        System.out.println("Enter the website otr ip address:");
        serverName=input.nextLine();
        System.out.println("Enter how many times you want to ping");
        n=input.nextInt();
        long[] store=new long[n];
        for (int i=0;i<n;i++) {
            long currentTime = System.currentTimeMillis();
           InetAddress.getByName(serverName).isReachable(5000);
            currentTime = System.currentTimeMillis() - currentTime;
            System.out.println(currentTime);
                store[i] = currentTime;

        }
        Arrays.sort(store);
        System.out.println("Median of time taken to ping:");
        if(n%2!=0)
        {System.out.println(store[(n+1)/2]+"ms");}
        else{
           long avg=(store[n/2]+store[(n/2)+1])/2;
            System.out.println(avg+"ms");
        }

    }
}

