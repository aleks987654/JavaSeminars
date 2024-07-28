package org.example.seminar05.dz05_03;

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
        // Построение кучи (перегруппируем массив)
        for (int i = sortLength / 2 - 1; i >= 0; i--)
            heapify(tree, sortLength, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=sortLength-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = tree[0];
            tree[0] = tree[i];
            tree[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(tree, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }



    public static void heapSort(int[] sortArray, int sortLength) {
        // Введите свое решение ниже
        buildTree(sortArray, sortLength);
    }
}

public class dz05_03 {
    public static void main(String[] args) {
        int[] initArray;

        initArray = new int[]{5, 8, 12, 3, 6, 9};

        /**
        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
         */

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
