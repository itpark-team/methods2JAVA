package com.company;

public class Main {

    /*static int sum(int a, int b) {
        return a+b;
    }

    static void sum(int a, int b) {
        return;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    /**
     *
     * @param numbers целые числа для сложения перечисленные через запятую
     * @return сумму всех переданных целых чисел
     */
    static int sum(int... numbers) {
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int result = sum(3,6,7,7);
        System.out.println(result);
    }
}
