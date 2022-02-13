package com.pingdemo;


import java.io.IOException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws IOException {
        PingDemo p=new PingDemo();
        Scanner in = new Scanner(System.in);
        String HostNAme;
        String Requests;
        while(true) {
            System.out.println("Enter the URL/Ip address or 0 to exit the code : ");
            HostNAme = in.nextLine();

            if(HostNAme.equalsIgnoreCase("0") )
            {
                break;
            }
            System.out.println("Enter the no. of echo requests to be sent");
            Requests= in.nextLine();
            p.CheckPing(HostNAme,Requests);
        }
    }
}