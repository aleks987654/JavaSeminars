package org.example.seminar02.cw02;

//TODO : Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

public class Ex2_02 {
    public static void main(String[] args) {
        String strIn = "aaaabbbcdde";
        System.out.println(getShotString(strIn));
    }

    private static StringBuilder getShotString(String strIn) {
        StringBuilder strOut = new StringBuilder();
       strOut.append(strIn.charAt(0));
        for (int i = 1; i < strIn.length(); i++) {
            if (strIn.charAt(i-1) != strIn.charAt(i)) {
                strOut.append(strIn.charAt(i));
            }
        }
        return strOut;
    }
}
