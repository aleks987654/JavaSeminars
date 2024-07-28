package org.example.seminar03.dz3_01;

class MergeSort {
    public static int[] mergeSortfinal(int[] a) {
        // Напишите свое решение ниже
        mSort(a, 0, a.length - 1);
        return a;
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


public class dz3_01 {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{5, 1, 6, 2, 3, 4};
        /**
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        } */

        MergeSort answer = new MergeSort();
        String itresume_res = convertArrayToString(answer.mergeSortfinal(a));
        System.out.println(itresume_res);
    }
    public static String convertArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(",");
        }
        return sb.toString().substring(0, sb.length() - 1); // Убираем последний разделитель
    }
}
