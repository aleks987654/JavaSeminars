package org.example.seminar01.dz3;

class Calculator {
    public double calculate(char op, int a, int b) {
        /**
         * Реализовать простой калькулятор
         * Введите свое решение ниже
         */
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;


    }
}

public class dz3 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 5;
            op = '&';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        // Ниже добавить проверку оператора на корректность
        String str = "+-*/";
        int index = str.indexOf(op);
        if (index == -1) {
            System.out.println(String.format("Некорректный оператор: '%c'", op));
        } else {
            Calculator calculator = new Calculator();
            double result = calculator.calculate(op, a, b);
            System.out.println(result);
        }
    }

}
