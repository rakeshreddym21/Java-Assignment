package com.cycles;

public class MAin {
    public static void main(String[] args) {
        cycle c=CycleFactory.getCycle("unicycle");
        c.race();
    }
}
