public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public void increaseFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}