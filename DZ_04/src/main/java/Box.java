import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001;
    }

    public void pourTo(Box<T> otherBox) {
        if (this == otherBox) {
            return; // Нельзя пересыпать в себя
        }
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}