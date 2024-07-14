package org.example.seminar01.cw1_03;

/**
 * Дана строка. Поменять местами её половины.
 */

public class Ex1_03 {
    public static void main(String[] args) {
        String str = "qweasd";
        String result = str.substring(str.length()/2) +
                        str.substring(0, str.length()/2);
        System.out.println("result = " + result);

    }

}
