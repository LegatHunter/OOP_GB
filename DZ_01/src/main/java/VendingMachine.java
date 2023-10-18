//package Seminar_01;

import java.util.List;

public class VendingMachine {
    private List<Choko> chokos;

    public VendingMachine(List<Choko> chokos) {
        this.chokos = chokos;
    }

    public BlackChoko getBlackChoko(String name, double volume, int price, int i){
        for (Choko choko: chokos) {
            if(choko instanceof BlackChoko){
                BlackChoko blackChoko = (BlackChoko) choko;
                if(blackChoko.getPrice() == price && blackChoko.getVolume() == volume && blackChoko.getName().equals(name)){
                    return blackChoko;
                }

            }
        }
        return null;
    }
}