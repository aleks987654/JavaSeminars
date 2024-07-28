package org.example.seminar01.cw_sem01_01;

import java.util.Scanner;

public class Ex0_01 {
    public static void main(String[] args) {
        System.out.println("Hello, occupants-pirates!");

        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getPrMinusSum(n);
        System.out.println("result = " + result);
    }

    /**
     * @apiNote description
     * @param n input number
     * @return product minus sum
     */

    private static int getPrMinusSum(int n) {
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }

}
