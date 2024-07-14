package org.example.seminar01.cw1_04;

import java.util.Scanner;

public class Ex1_04 {
    /**
     * Дан массив целых чисел. Верно ли,
     * что массив является симметричным.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("Input array[%d]: ", i));
            arr[i] = scanner.nextInt();
        }
        System.out.print("array = [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(String.format("%d, ", arr[i]));
        }
        System.out.print(String.format("%d]\n", arr[arr.length - 1]));

        if (isSymmetrical(arr)) {
            System.out.println("array is symmetrical");
        } else {
            System.out.println("array is not symmetrical");
        }

    }

    private static boolean isSymmetrical(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
