package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.data.Dragon;
import by.itstep.julja8806.model.logic.DragonLogic;
import by.itstep.julja8806.utill.UserInput;
import by.itstep.julja8806.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.name = UserInput.inputString("Input dragon name: ");
        dragon.age = UserInput.inputNumber("Input dragon age: ");

        int head = DragonLogic.calculateDragonHeads(dragon);
        String msg = String.format("%s has %d heads\n", dragon.name, head);
        Printer.print(msg);

    }
}