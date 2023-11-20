package ru.geekbrains.lesson6.srp2;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order();
        OrderConsoleInput input = new OrderConsoleInput();
        input.inputFromConsole(order);

        OrderJsonSaver saver = new OrderJsonSaver();
        saver.saveToJson(order);
    }
}
