public class Program {

    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox1.pourTo(orangeBox2);

        System.out.println("Вес orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Вес orangeBox2: " + orangeBox2.getWeight());
        System.out.println("Вес appleBox: " + appleBox.getWeight());

        boolean isEqual = orangeBox1.compare(appleBox);
        System.out.println("Одинаковы ли по весу OrangeBox1 и AppleBox? " + isEqual);
    }
}