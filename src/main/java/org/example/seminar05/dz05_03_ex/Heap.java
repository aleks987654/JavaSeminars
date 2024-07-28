package org.example.seminar05.dz05_03_ex;

public class Heap {
    public int[] heap;
    private int size;

    public Heap(int[] array, int length) {
        this.heap = new int[length + 1]; // +1 для индексации
        for (int i = 0; i < length; i++) {
            heap[i + 1] = array[i];
        }
        size = length;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = size / 2; i >= 1; i--) {
            siftDown(i);
        }
    }

    // Метод для построения минимальной кучи
    private void siftDown(int index) {
        int childIndex = index  *  2;
        while (childIndex <= size) {
            if (childIndex < size && heap[childIndex] > heap[childIndex + 1]) {
                childIndex++;
            }
            if (heap[index] > heap[childIndex]) {
                swap(index, childIndex);
                index = childIndex;
                childIndex = index  *  2;
            } else {
                break;
            }
        }
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public int peek() {
        return heap[1];
    }

    // Другие методы для работы с кучей...
}
