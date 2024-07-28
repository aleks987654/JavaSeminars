package org.example.seminar03.dz3_02_ex;

import java.util.ArrayList;
import java.util.List;

public class dz03_02_ex {
    public static List<Integer> remEvenNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) { // Проверяем, является ли число четным
                result.add(num); // Добавляем нечетное число в результат
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {2, 4, 6, 8};
        List<Integer> result = remEvenNumbers(arr);
        System.out.println(result); // Выводим результат
    }
}
