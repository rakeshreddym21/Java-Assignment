package com.UpcastaandDowncast;

public class Main {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        c[0]=new UniCycle();
        c[1]=new Bicycle();
        c[2]=new TriCycle();
        c[1].balance();
        c[2].balance();
        UniCycle u=(UniCycle) c[0];
        Bicycle b=(Bicycle) c[1];
        TriCycle t=(TriCycle) c[2];
        t.balance();
        u.balance();
        u.race();


    }
}
