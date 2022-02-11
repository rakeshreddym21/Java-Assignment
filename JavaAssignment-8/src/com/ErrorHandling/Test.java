package com.ErrorHandling;

public class Test {
    public void ExceptionThrow(String S) throws Exception1, Exception2, Exception3 {

        if (S.equalsIgnoreCase("ex1")) {
            throw new Exception1("Exception 1 is thrown");
        } else if (S.equalsIgnoreCase("ex2")) {
            throw new Exception2("Exception 2 is thrown");
        } else {
            throw new Exception3("Exception 3 is thrown");
        }
    }
}