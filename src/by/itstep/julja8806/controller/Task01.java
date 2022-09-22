package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.data.Dragon;
import by.itstep.julja8806.model.logic.DragonLogic;
import by.itstep.julja8806.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        Dragon garinich = new Dragon();
        garinich.age = 120;
        garinich.name = "Garinich";

        Dragon pushok = new Dragon();
        pushok.age = 350;
        pushok.name = "Pushok";

        int head = DragonLogic.calculateDragonHeads(garinich);
        String msg = String.format("Garinich has %d heads\n", head);
        Printer.print(msg);

        head = DragonLogic.calculateDragonHeads(pushok);
        msg = String.format("Pushok has %d heads\n", head);
        Printer.print(msg);
    }
}
