package org.example.seminar04.dz04_01;

import java.util.Collections;
import java.util.LinkedList;

class LLTasks {
    public static void revertLL(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        if (ll.isEmpty() || ll.size() <= 1) return; // Список уже развернут или пуст

        Object lastItem = ll.removeLast(); // Получаем последний элемент
        revertLL(ll); // Рекурсивно разворачиваем остаток списка
        ll.addFirst(lastItem); // Добавляем последний элемент в начало списка
    }

}

public class dz04_01 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        /**
        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }
         */

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.revertLL(ll);
        System.out.println(ll);
    }
}

