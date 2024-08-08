package org.example.seminar06.dz06;

import java.util.*;

public class dz06 {

    public static void main(String[] args) {
        Notebooks nb1 = new Notebooks();
        nb1.id = 1;
        nb1.CPU = "intel i3";
        nb1.RAM = 4;
        nb1.ROM = 500;
        nb1.OS = "windows 7";
        nb1.Color = "pink";

        Notebooks nb2 = new Notebooks();
        nb2.id = 2;
        nb2.CPU = "intel i3";
        nb2.RAM = 2;
        nb2.ROM = 250;
        nb2.OS = "windows 7";
        nb2.Color = "grey";

        Notebooks nb3 = new Notebooks();
        nb3.id = 3;
        nb3.CPU = "intel i5";
        nb3.RAM = 8;
        nb3.ROM = 500;
        nb3.OS = "windows 10";
        nb3.Color = "grey";

        Notebooks nb4 = new Notebooks();
        nb4.id = 4;
        nb4.CPU = "intel i5";
        nb4.RAM = 4;
        nb4.ROM = 500;
        nb4.OS = "windows 7";
        nb4.Color = "black";

        Notebooks nb5 = new Notebooks();
        nb5.id = 5;
        nb5.CPU = "intel i7";
        nb5.RAM = 16;
        nb5.ROM = 1000;
        nb5.OS = "windows 10";
        nb5.Color = "grey";

        Notebooks nb6 = new Notebooks();
        nb6.id = 6;
        nb6.CPU = "intel i7";
        nb6.RAM = 16;
        nb6.ROM = 1000;
        nb6.OS = "windows 10";
        nb6.Color = "grey";

        Notebooks nb7 = new Notebooks();
        nb7.id = 7;
        nb7.CPU = "intel i7";
        nb7.RAM = 32;
        nb7.ROM = 1000;
        nb7.OS = "windows 11";
        nb7.Color = "black";

        Set<Notebooks> nbs = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7));

        System.out.println("List of all notebooks:");
        for (Notebooks notebook : nbs) {
            System.out.println(notebook);
        }

        Map<Integer, String> selectParams = new HashMap<>();
//        selectParams.put(5, "10");
//        selectParams.put(2, "8");
        System.out.println("Select parameters\n1.id\n2.RAM\n3.ROM\n4.CPU\n5.OS\n6.Color\n0.Finish\n");
        Scanner scanner = new Scanner(System.in);
        boolean inputInt = true;

        while (true) {
            System.out.println("Enter parameter number for the selected notebooks");
            System.out.println("or 0 to finish: ");
            int paramNum = scanInt(scanner);

            String paramValue = null;
            if (paramNum == 0) break;
            if (paramNum > 0 & paramNum < 7) {
                System.out.println("Enter minimum value of the selected parameter: ");
                if (paramNum < 4){
                    int temp = scanInt(scanner);
                    if (temp > 0) {
                        paramValue = Integer.toString(temp);
                        selectParams.put(paramNum, paramValue);
                    } else {
                        System.out.println("Invalid parameter value!");
                    }
                } else {
                    paramValue = scanner.next();
                    selectParams.put(paramNum, paramValue);
                }
            } else {
                System.out.println("Invalid parameter number!");
            }
        }

        System.out.println("\nSelection parameters with minimum values: " + selectParams);

        System.out.println("\nList of selected notebooks:");
        for (Notebooks notebook : nbs) {
            if (notebook.isSelected(selectParams)) System.out.println(notebook);
        }
    }

    private static int scanInt(Scanner scanner) {
        int inputInt = 0;
        System.out.println("(please enter an integer): ");
        try {
            inputInt = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not an integer");
            scanner.nextLine(); // Пропускаем остаток строки
            inputInt = -1;
        } finally {
            return inputInt;
        }
    }


}
