//package Seminar_01;

import java.util.ArrayList;

public class ChokoMachine {
    public static void main(String[] args) {
        Choko blackChoko = new BlackChoko("MilkaBlack", 0.2, 100, 150);
        Choko whiteChoko = new WhiteChoko("MilkaWhite", 0.3,120, 200);
        ArrayList<Choko> chokos = new ArrayList<>();
        chokos.add(blackChoko);
        chokos.add(whiteChoko);

        VendingMachine vendingMachine = new VendingMachine(chokos);
        BlackChoko blackChoko1 = vendingMachine.getBlackChoko("MilkaBlack", 0.2, 100, 150);
        if(blackChoko1 == null){
            System.out.println("There's no such thing as a candy bar");
        } else {
            System.out.println(blackChoko1.displayInfo());
        }
    }
}