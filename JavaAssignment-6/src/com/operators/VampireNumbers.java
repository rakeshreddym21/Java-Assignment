package com.operators;

import java.util.Arrays;

public class VampireNumbers {
public void PrintVampireNumbers(int num)
{
    int count = num;
    for (int i = 0; count >0; i++) {
        String V = String.valueOf(i);
        int n = V.length();
        if (n % 2 != 0) {                               //If the number of digits are odd,It is not vampire number
            continue;
        }
        char[] a= V.toCharArray();
        Arrays.sort(a);

       for (int j = (int) Math.pow(10, n / 2 - 1); j < (int) Math.pow(10, n / 2 ); j++) {
            int flag=0;
            if (i % j == 0) {
                int  x = j;
                int y = i / j;
                String b = String.valueOf(x)+String.valueOf(y);
                char[] c=b.toCharArray();
                Arrays.sort(c);
                boolean check=Arrays.equals(a,c);
                if( (i%10==0 && j%10==0) || !check)      //If both factors contain trailing zeros it is not vampire number
                {                                        //Every digit from both factors should present in number

                    continue;
                }

                else
                {
                    System.out.println(i);
                    count--;
                    flag=1;
                }
            }
            if(flag==1){
                break;
            }
        }
    }
}
}
