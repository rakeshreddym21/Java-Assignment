package com.pingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String servername;
        System.out.println("Enter the website otr ip address:");

        servername = input.nextLine();
        String[] command = {"cmd.exe", "/C", "ping " + servername};
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader buff = new BufferedReader(new InputStreamReader(p.getInputStream()));
        System.out.println(buff);
        String readline;
        while ((readline = buff.readLine()) != null) {
            if (readline.contains("Reply")) {
                System.out.println("Pinged " + servername + " in : "
                        + readline.substring(readline.indexOf("time=") + 5, readline.indexOf("ms")) + " ms");


            }
        }
    }
}

























          /*Scanner input=new Scanner(System.in);
        int n;
        String servername;
        System.out.println("Enter the website otr ip address:");
        servername=input.nextLine();
        System.out.println("Enter how many times you want to ping");
        n=input.nextInt();
        String store="";
        for (int i=0;i<n;i++) {
            long currentTime = System.currentTimeMillis();
            System.out.println(currentTime);
            boolean isPinged = InetAddress.getByName(servername).isReachable(5000); // 2 seconds
            currentTime = System.currentTimeMillis() - currentTime;
            System.out.println(currentTime);
            store=store+String.valueOf(currentTime)+" ";
        }

        System.out.println(store);
    }
}
/*if(isPinged) {
        System.out.println("pinged successfully in "+ currentTime+ "millisecond");
        } else {
        System.out.println("PIng failed.");
        }*/
