package org.example.seminar06.dz06;

import org.example.seminar06.sem06_03.Cat;

import java.util.*;

public class dz06 {

    public static void main(String[] args){
        Notebooks nb1 = new Notebooks();
        nb1.id = 1;
        nb1.CPU  = "Intel i3";
        nb1.RAM = 4;
        nb1.ROM = 500;
        nb1.OS = "Windows 7";
        nb1.Color = "Pink";

        Notebooks nb2 = new Notebooks();
        nb2.id = 2;
        nb2.CPU  = "Intel i3";
        nb2.RAM = 2;
        nb2.ROM = 250;
        nb2.OS = "Windows 7";
        nb2.Color = "Gray";

        Notebooks nb3 = new Notebooks();
        nb3.id = 3;
        nb3.CPU  = "Intel i5";
        nb3.RAM = 8;
        nb3.ROM = 500;
        nb3.OS = "Windows 10";
        nb3.Color = "Gray";

        Notebooks nb4 = new Notebooks();
        nb4.id = 4;
        nb4.CPU  = "Intel i5";
        nb4.RAM = 4;
        nb4.ROM = 500;
        nb4.OS = "Windows 7";
        nb4.Color = "Black";

        Notebooks nb5 = new Notebooks();
        nb5.id = 5;
        nb5.CPU  = "Intel i7";
        nb5.RAM = 16;
        nb5.ROM = 1000;
        nb5.OS = "Windows 10";
        nb5.Color = "Gray";

        Notebooks nb6 = new Notebooks();
        nb6.id = 6;
        nb6.CPU  = "Intel i7";
        nb6.RAM = 16;
        nb6.ROM = 1000;
        nb6.OS = "Windows 10";
        nb6.Color = "Gray";

        Notebooks nb7 = new Notebooks();
        nb7.id = 7;
        nb7.CPU  = "Intel i7";
        nb7.RAM = 32;
        nb7.ROM = 1000;
        nb7.OS = "Windows 11";
        nb7.Color = "Black";

        //System.out.println(nb1);
        //System.out.println(nb1.getOS());
        //System.out.println(nb1.toHashMap());

        Set<Notebooks> nbs = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7));
         for (Notebooks notebook : nbs) {
            System.out.println(notebook);
        }

        Map<Integer, String> filters = new HashMap<>();
        filters.put(5, "10");
        filters.put(2, "8");

        System.out.println(filters);


        // Поиск элемента с RAM>=16
//        for (Notebooks notebook : nbs) {
//            if (Integer.parseInt(notebook.getPARAM(2)) >= 16) {
//                System.out.println(notebook);
//            }
//        }
        System.out.println("Filtered notebooks:");
        for (Notebooks notebook : nbs) {
            boolean flag = true;
            for (Map.Entry<Integer, String> entry : filters.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                if (key < 4) {
                    if (Integer.parseInt(notebook.getPARAM(key)) < Integer.parseInt(value)) flag = false;
                } else {
                    if (!notebook.getPARAM(key).contains(value)) flag = false;
                }
            }
            if (flag) System.out.println(notebook);
        }
    }
}
