package by.itstep.julja8806.model.logic;

import by.itstep.julja8806.model.data.Dragon;

public class DragonLogic {
    public static final int First_Period = 100;
    public static final int Second_Period = 200;


    public static int calculateDragonHeads(Dragon dragon) {
        if (dragon.age < 1) {
            return -1;
        }
        int head = 3;
        if (dragon.age <= First_Period) {
            head += dragon.age * 3;
        } else if (dragon.age <= Second_Period) {
            head += First_Period * 3 - 200 + dragon.age * 2  ;
        } else {
            head += First_Period * 3 + (Second_Period - First_Period) * 2  - Second_Period + dragon.age ;
        }

        return head;
    }
}
