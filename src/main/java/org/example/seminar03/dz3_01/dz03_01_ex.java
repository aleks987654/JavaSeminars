package org.example.seminar03.dz3_01;

public class dz03_01_ex {
    public static void main(String[] args) {
        int[] array = {9, 4, 6, 8, 1, 7, 3, 2};
        mSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mSort(int[] array, int left, int right) {
        if (left < right) {
            // Находим середину массива
            int middle = (left + right) / 2;

            // Рекурсивно вызываем функцию для левой половины массива
            mSort(array, left, middle);

            // Рекурсивно вызываем функцию для правой половины массива
            mSort(array, middle + 1, right);

            // Сливаем две отсортированные половины
            merge(array, left, middle, right);
        }
    }

    // Функция для слияния двух отсортированных частей массива
    private static void merge(int[] array, int left, int middle, int right) {
        // Создаем временный массив для хранения результатов слияния
        int[] tempArray = new int[right - left + 1];

        // Индексы для левой и правой частей массива
        int leftIndex = left;
        int rightIndex = middle + 1;

        // Индекс для временного массива
        int k = 0;

        while (leftIndex <= middle && rightIndex <= right) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[k++] = array[leftIndex++];
            } else {
                tempArray[k++] = array[rightIndex++];
            }
        }

        // Копируем оставшиеся элементы из левой части
        while (leftIndex <= middle) {
            tempArray[k++] = array[leftIndex++];
        }

        // Копируем оставшиеся элементы из правой части
        while (rightIndex <= right) {
            tempArray[k++] = array[rightIndex++];
        }

        // Копируем отсортированный временный массив обратно в исходный массив
        for (int i = 0; i < tempArray.length; i++) {
            array[left + i] = tempArray[i];
        }
    }
}
