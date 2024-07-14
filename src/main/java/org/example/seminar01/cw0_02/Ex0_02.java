package org.example.seminar01.cw0_02;

import java.util.Scanner;

public class Ex0_02 {
    public static void main(String[] args) {
        /** Дана последовательность N целых чисел.
         *  Найти количество положительных чисел,
         *  после которых следует отрицательное число.
         */

        System.out.println("Input count of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println("k = " + k);

    }

    private static int getK(Scanner scanner, int n) {
        int k = 0;
        System.out.println("Input number 1: ");
        int a = scanner.nextInt();
        int b;
        for (int i = 1; i < n; i++) {
            System.out.println(String.format("Input number %d: ", i+1));
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}
