package HW2;

public class Main {
    public static void main(String[] args) {
        System.out.println(returnAmount(7,1));  // 1 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        checkPositive(-15);                         // 2 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        System.out.println(returnPositive(12));     // 3 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        printSeveralTimes("MAMA", 3);          // 4 Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз.

        System.out.println(returnLap(2000));        // 5 Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    }

    private static boolean returnAmount(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkPositive(int i) {
        if (i >= 0) {
            System.out.println("Число " + i + "положительное");
        } else {
            System.out.println("Число " + i + " отрицательное");
        }
    }

    private static boolean returnPositive(int i) {
        if (i >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printSeveralTimes(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    private static boolean returnLap(int i) {
        if (i % 400 == 0) {
            return true;
        } else if (i % 100 == 0) {
            return false;
        } else if (i % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
