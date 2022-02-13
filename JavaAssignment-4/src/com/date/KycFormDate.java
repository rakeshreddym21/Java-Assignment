package com.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class KycFormDate {
    public void getKycDates(String signup,String current){
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signupDate = LocalDate.parse(signup,f);                                    //String to LocalDate
        LocalDate currentDate = LocalDate.parse(current, f);
        int day = signupDate.getDayOfMonth();
        Month month =signupDate.getMonth();
        int year = currentDate.getYear();
        LocalDate AnniversaryDate = LocalDate.of(year, month, day);                          //Current year Anniversary
        String pastDate="";
        String futureDate="";
        int flag = 0;
        if(AnniversaryDate.minusDays(30).isAfter(currentDate) || AnniversaryDate.minusDays(30).isEqual(currentDate)) {
            flag = 1;
        }
        else
        {
            pastDate=AnniversaryDate.minusDays(30).format(f);
        }
        if(flag == 0) {
            if (AnniversaryDate.plusDays(30).isAfter(currentDate) || AnniversaryDate.plusDays(30).isEqual(currentDate))
            {
                futureDate=currentDate.format(f);
            }
            else
            {
                futureDate= AnniversaryDate.plusDays(30).format(f);
            }
        }
        if(flag==1)
        {
            System.out.println("No Range");
        }
        else{
            System.out.println(pastDate+" "+futureDate);
        }
}
}
