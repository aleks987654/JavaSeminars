package org.example.seminar06.sem06_03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sem06_03 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Mimi";
        cat1.color = "black";
        cat1.age = 2;
        cat1.evner = "Tom";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Barsik";
        cat2.color = "red";
        cat2.age = 3;
        cat2.evner = "Ivan";

        Cat cat3 = new Cat();
        cat3.id = 3;
        cat3.name = "Yuki";
        cat3.color = "red";
        cat3.age = 5;
        cat3.evner = "Denis";

        Cat cat11 = new Cat();
        cat11.id = 1;
        cat11.name = "Mimi";
        cat11.color = "black";
        cat11.age = 2;
        cat11.evner = "Tom";

        System.out.println(cat11);
        System.out.println(cat3);
        System.out.println(Arrays.asList(cat11, cat3));

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat11));
        System.out.println(cats);
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat11));

        HashSet<Cat> cats2 = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            cats2.add(new Cat());
        }
        long end = System.currentTimeMillis();
        System.out.println("Время создания: " + (end-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            cats2.contains(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Время : " + (end-start));
    }
}
