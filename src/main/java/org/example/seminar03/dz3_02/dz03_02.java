package org.example.seminar03.dz3_02;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) { // Проверяем, является ли число четным
                result.add(num); // Добавляем нечетное число в результат
            }
        }
        System.out.println(result);



    }
}

public class dz03_02 {
    public static void main(String[] args) {
        //Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr = new Integer[]{2, 4, 6, 8};

        /**
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
        */

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}
