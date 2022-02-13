package com.date;

import java.util.Scanner;

public class KycTest  {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of Test Cases to be tested:");
        n=input.nextInt();
        input.nextLine();
        String[] sDate = new String[n];
        String[] cDate=new String[n];
        System.out.println("Enter details of signup and current dates in dd-mm-yyyy dd-mm-yyyy format:");
          int i=0;
          while(i<n) {
            String dates;
            dates= input.nextLine();
            String[] datesList=dates.split("\\s");
            sDate[i]=datesList[0];
            cDate[i]=datesList[1];
            i++;
        }
        KycFormDate kyc=new KycFormDate();
        for(int k=0;k<n;k++){
            kyc.getKycDates(sDate[k],cDate[k]);
        }

    }
}