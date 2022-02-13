package com.cycles;

public class CycleFactory {
    public static cycle getCycle(String S){
        if(S.equalsIgnoreCase("unicycle"))
            return new unicycle();
        else if(S.equalsIgnoreCase("bicycle"))
            return new Bicycle();
        else
            return new TriCycle();

    }
}
