package org.example.seminar01.dz2;

import java.util.Scanner;

/**
 * Вывести все простые числа от 1 до 1000
 */
public class dz2 {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(2);
        if (n > 2) {
            for (int i = 3; i <= n; i += 2) {
                boolean flag = true;
                for (int j = 3; j < i; j += 2) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                }
            }
        }
    }

}