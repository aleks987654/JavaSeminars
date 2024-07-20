package org.example.seminar02.cw01;

//TODO : Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        /** Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N,
         * которая состоит из чередующихся символов c1 и c2, начиная с c1.
         */
        System.out.println("Input length of string: ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();

        if (n <= 1 || n % 2 == 1) {
            throw new Exception("n not correct");
        }


        System.out.println("Input first char: ");
        Scanner scanner2 = new Scanner(System.in);
        String c1 = scanner2.nextLine();

        System.out.println("Input second char: ");
        Scanner scanner3 = new Scanner(System.in);
        String c2 = scanner3.nextLine();

        System.out.println(getShaffleString(n, c1, c2));
    }

    private static StringBuilder getShaffleString(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        StringBuilder repeat = result.repeat(c1 + c2, n / 2);
        return repeat;
    }
}
