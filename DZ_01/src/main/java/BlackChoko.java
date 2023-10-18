//package Seminar_01;

public class BlackChoko extends Choko{
    private int colories;
    private double price;

    public BlackChoko(String name, double volume, int colories, double price){
        super(name, volume);
        checkColories(colories);
        checkPrice(price);

    }

    public int getColories() {
        return colories;
    }

    public void setColories(int colories) {
        this.colories = colories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void checkPrice(double price){
        if(price < 100) {
            this.price = 100;
        }else {
            this.price = price;
        }
    } public void checkColories(int colories){
        if(colories < 100) {
            this.colories = 100;
        }else {
            this.colories = colories;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("Заберите вашу шоколадку - Тип: %s, кг: %.1f, колорий: %s, цена: %s"
                , name, volume, colories, price);
    }
}