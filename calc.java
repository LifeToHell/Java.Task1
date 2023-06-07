/*
 * 3) Реализовать простой калькулятор
+ - / *

Введите первое число: A \n
Введите знак: *
Введите второе число: B
Результат: A*B
 */

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = iScanner.nextDouble();
        System.out.print("Введите операцию: ");
        String op = iScanner.next();
        System.out.print("Введите второе число: ");
        double b = iScanner.nextDouble();
        double c = 0;

        switch (op) {
            case "*":
                c = a * b;
                res(c);
                break;
            case "/":
                c = a / b;
                res(c);
                break;
            case "+":
                c = a + b;
                res(c);
                break;
            case "-":
                c = a - b;
                res(c);
                break;

            default:
                System.out.println("Данные не верны, попробуйте еще раз");
                break;
        }

    }

    public static void res(double result) {
        System.out.printf("Результат операции: %.2f", result);
    }
}
