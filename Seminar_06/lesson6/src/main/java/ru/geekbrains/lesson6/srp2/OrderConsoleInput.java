package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class OrderConsoleInput {
    public void inputFromConsole(Order order) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Client name: ");
        order.setClientName(scanner.nextLine());
        System.out.print("Product: ");
        order.setProduct(scanner.nextLine());
        System.out.print("Quantity: ");
        order.setQnt(Integer.parseInt(scanner.nextLine()));
        System.out.print("Price: ");
        order.setPrice(Integer.parseInt(scanner.nextLine()));
    }
}
