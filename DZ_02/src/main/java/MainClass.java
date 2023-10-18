public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 7);
        cats[2] = new Cat("Муся", 10);

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " голоден: " + cat.isHungry());
        }

        plate.increaseFood(10);
        plate.info();
    }
}