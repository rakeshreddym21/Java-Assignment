package com.ErrorHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        String S;
        System.out.println("Enter input:");
        S= input.nextLine();
        Test t=new Test();

        try {
          t.ExceptionThrow(S);
        }
        catch (Exception1|Exception2|Exception3 e){
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}
