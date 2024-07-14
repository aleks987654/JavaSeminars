package org.example.seminar01.dz1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 * (произведение чисел от 1 до n)
 */
public class dz1 {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countNTriangle(n);
        System.out.println("result = " + result);
    }

    private static int countNTriangle(int n) {
        if (n >= 1) {
            return (n * (n + 1)) / 2;
        }
        return -1;
    }

}
