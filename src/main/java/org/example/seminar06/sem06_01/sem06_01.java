package org.example.seminar06.sem06_01;

import java.util.*;

/**
Задание №1

 1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
 2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.

 Для вычисления процента используйте формулу:
 процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве
*/

public class sem06_01 {
    /**
    public static void main(String[] args) {
        int[] array = fillArray(15, 25);
        System.out.println(Arrays.toString(array));
        System.out.println(getUniquePercent(array) + " %");

    }
    public static int[] fillArray(int size, int bound){
        Random rmd = new Random();
        int[] arr = new int[size];
        for (int el = 0; el < arr.length; el++) {
           arr[el] = rmd.nextInt(bound);
        }
        return arr;
    }
    public static double getUniquePercent(int[] arr){
        Set<Integer> uniqueValue = new HashSet<>();
        for (int el : arr) {
            uniqueValue.add(el);
        }
        return uniqueValue.size() * 100f / arr.length;
    }
     */

    public static void main(String[] args) {
        List<Integer> array = fillArray(15, 25);
        System.out.println(array);
        System.out.println(getUniquePercent((ArrayList<Integer>) array) + " %");

    }
    public static ArrayList<Integer> fillArray(int size, int bound){
        Random rmd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(rmd.nextInt(bound));
        }
        return arr;
    }
    public static float getUniquePercent(ArrayList<Integer> arr){
        Set<Integer> uniqueValue = new HashSet<>(arr);
        return uniqueValue.size() * 100f / arr.size();
    }

}
