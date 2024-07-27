import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(intSumRange(1, 2));
        printNumbers(-21);
        System.out.println(negativeNumbers(-2));
        stringAndNumbers("Hello World", 3);
        System.out.println(leapYear(2004));

        int[] array1 = {1,1,1,0,0,0,1};
        integerArray(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array2 = new int[100];
        emptyIntegerArray(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        sixArray(array3);
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[][] matrix = new int[3][3];
        squareIntegerArray(matrix);
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[] array4 = initArray(2,8);
        for (int i : array4) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printThreeWords() { // 1 метод
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() { // 2 метод
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() { // 3 метод
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() { // 4 метод
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean intSumRange(int a, int b) { // 5 метод
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void printNumbers(int number) { // 6 метод
        if (number >= 0) {
            System.out.println("Число - положительное");
        } else {
            System.out.println("Число - отрицательное");
        }
    }
    public static boolean negativeNumbers(int number) { // 7 метод
        return number < 0;
    }
    public static void stringAndNumbers(String str, int number) { // 8 метод
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }
    public static boolean leapYear(int year) { // 9 метод
        if (year % 400 == 0){
            return true;
        } else if (year % 100 ==0) {
            return false;
        }else {
            return year % 4 == 0;
        }
    }
    public static void integerArray(int[] array) { // 10 метод
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0)? 1:0;
        }
    }
    public static void emptyIntegerArray(int[] array) { // 11 метод
        for (int i = 0; i< array.length; i++) {
            array[i] = i + 1;
        }
    }
    public static void sixArray(int[] array) {  // 12 метод
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }
    public static void squareIntegerArray(int[][] matrix) { // 13 метод
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }
    public static int[] initArray(int len, int initialValue) { // 14 метод
        int[] array = new int[len];
        for (int i = 0; i <array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}