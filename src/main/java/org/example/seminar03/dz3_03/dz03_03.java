package org.example.seminar03.dz3_03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) result.add(num);

        Collections.sort(result);

        // Сумма всех элементов списка
        long sum = result.stream().mapToLong(i -> i).sum();

        // Среднее арифметическое
        double average = (double) sum / result.size();


        System.out.println(result);
        System.out.println("Minimum is " + Collections.min(result));
        System.out.println("Maximum is " + Collections.max(result));
        System.out.println("Average is " + average); // косячники бл


    }
}

public class dz03_03 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};

        /**
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
         */

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
