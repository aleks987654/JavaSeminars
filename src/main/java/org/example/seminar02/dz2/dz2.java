package org.example.seminar02.dz2;

import org.example.seminar02.cw4.Ex1_04;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {

    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) throws IOException {
        /**System.out.println("Lets go");*/
        log = new File("src/main/java/org/example/seminar02/dz2/log.txt");
        try {
            log.createNewFile();
            fileWriter = new FileWriter(log);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = new Date();
            String currentDateTime = sdf.format(date);

            int n = mas.length;
            boolean swapped;

            do {
                swapped = false;
                for (int i = 0; i < n - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        // Меняем местами элементы
                        int temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                        swapped = true;
                    }
                }
                n--; // Уменьшаем размер отсортированной части массива
                StringBuilder sb = new StringBuilder();
                for (int num : mas) {
                    sb.append(num).append(", ");
                }
                sb.deleteCharAt(sb.length() - 2); // Убираем последний запятый
                String sortedArray = sb.toString().trim();
                currentDateTime = sdf.format(date);
                fileWriter.write(currentDateTime + " [" + sortedArray + "]" + "\n");

            } while (swapped);
        //fileWriter.write("ffttfftt");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




public class dz2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/example/seminar02/dz2/log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
