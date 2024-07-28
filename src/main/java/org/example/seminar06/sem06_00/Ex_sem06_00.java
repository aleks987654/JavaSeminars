package org.example.seminar06.sem06_00;
/**
Задание №0
        1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
        6, 3}. Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex_sem06_00 {
    public static void main(String[] args) {
        hashSet();
        linkedHashSet();
        treeSet();
    }

    private static void hashSet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(6);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(3);
        System.out.println("Множество: " + set1);
    }

    private static void linkedHashSet() {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(6);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(3);
        System.out.println("Множество: " + set1);
    }

    private static void treeSet() {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(6);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(3);
        System.out.println("Множество: " + set1);
    }
}