package org.example.seminar02.cw3;

//TODO : Напишите метод, который определяет является ли строка палиндромом (шалаш)

public class Ex2_03 {
    public static void main(String[] args) {
        String stroka = "qweW eWQ".replaceAll("\\s", "").toLowerCase();
        if (stroka.equals(
                new StringBuilder(stroka).reverse().toString())
        ) {
            System.out.println("palindron");
        } else {
            System.out.println("not palindron");
        }

    }
}
