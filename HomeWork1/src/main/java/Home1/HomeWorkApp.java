package Home1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = ThreadLocalRandom.current().nextInt(-20, 20);
        int b = ThreadLocalRandom.current().nextInt(-20, 20);
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-200, 300);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt(-200, 300);
        int b = ThreadLocalRandom.current().nextInt(-200, 300);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("b < a");
        }
    }
}
