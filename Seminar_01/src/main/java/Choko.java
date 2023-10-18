public class Choko extends Product {

    /**
     * Колории
     */
    private int col;


    public double getCol() {
        return col;
    }

    public Choko(String brand, String name, double price, int col){
        super(brand, name, price);
        this.col = col;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадка]\n%s - %s - %.2f;\nКолории: %s",
                brand, name, price, col);
    }

}
}
