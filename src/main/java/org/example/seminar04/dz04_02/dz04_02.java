package org.example.seminar04.dz04_02;

import java.util.LinkedList;


class MyQueueInt {
    // Напишите свое решение ниже
    LinkedList<Integer> queue = new LinkedList<Integer>();

    public void enqueue(int element){
        // Напишите свое решение ниже
        queue.add(element);
    }


    public int dequeue(){
        // Напишите свое решение ниже
        int first = queue.removeFirst();
        return first;
    }


    public int first(){
        // Напишите свое решение ниже
        int first = queue.getFirst();
        return first;
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return (LinkedList<Integer>) queue;

    }


}


public class dz04_02 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        /**
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }
         */

        System.out.println(queue.getElements());



        // System.out.println(queue.dequeue()); косяк
        queue.dequeue();    // косяк исправлен
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());

    }
}
