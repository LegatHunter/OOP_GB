//package Seminar_01;

public class Choko {
    protected String name;
    protected double volume;

    public Choko(){
        this("name",0.2);
    }

    public Choko(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String displayInfo(){
        return String.format("%s, %.1f", name, volume);
    }
}