package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("  1 - Espresso");
        System.out.println("  2 - Cappuccino");
        System.out.println("  3 - Latte");

        System.out.print("Choose a drink: ");
        int choice = scanner.nextInt();

        coffeeMaker.makeCoffee(choice);

        scanner.close();
    }
}
