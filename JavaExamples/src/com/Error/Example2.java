package com.Error;

public class Example2 {
    public static void main(String[] args) {
        int i,j,k;
        j=0;
        int[] arr=new int[3];
        i=5;
        try{
            k=i/j;
            System.out.println(k);
            for(int p=0;p<=3;p++)
            {
                arr[p]=p+8;
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("Cant divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception");
        }
    }
}
