package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        dataReplase(); // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        dataFill();    // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        dataChange();  // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[][] arr = new int[8][8];
        dataFillSquare(arr);  // 4. Создать квадратный двумерный целочисленный массив, и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        dataInput();          // 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        findMinMax();         // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;

        System.out.println(findEqualParts()); // 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        
    }

    private static void dataReplase() {
        int[] data = new int[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void dataFill() {
        int[] data = new int[100];
        int n = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = n;
            n++;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void dataChange() {
        int[] data = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void dataFillSquare(int[][] arr) {
        int[][] data = new int[5][5];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == i || j == data.length - i - 1) {
                    data[i][j] = 1;
                } else {
                    data[i][j] = 0;
                }
            }
        }

        for (int[] datum : data) {
            for (int num : datum) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    static Scanner in = new Scanner(System.in);

    private static void dataInput() {
        int[] data = new int[getValueFromScanner("Введите длину массива: ")];
        int initialValue = getValueFromScanner("Введите целое число для заполнения массива: ");
        for (int i = 0; i < data.length; i++) {
            data[i] = initialValue;
        }
        System.out.println(Arrays.toString(data));
    }

    private static int getValueFromScanner(String str) {
        while (true) {
            System.out.print(str);
            if (in.hasNextInt()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - не число");
        }
    }

    private static void findMinMax() {
        int[] data = new int[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(21);
        }
        int MaxNum = data[0];
        int MinNum = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > MaxNum) {
                MaxNum = data[i];
            } else if (data[i] < MinNum) {
                MinNum = data[i];
            }
        }
        System.out.println(Arrays.toString(data));
        System.out.println("Минимальное число в массиве : " + MinNum);
        System.out.println("Максимальное число в массиве : " + MaxNum);

    }

    private static boolean findEqualParts() {
        int[] data = new int[getValueFromScanner("Введите длину массива: ")];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(data));
        int DataSum = 0;
        for (int i = 0; i < data.length; i++) {
            DataSum += data[i];
        }
        if (DataSum % 2 == 0) {
            return true;
        }
        return false;
    }

}
