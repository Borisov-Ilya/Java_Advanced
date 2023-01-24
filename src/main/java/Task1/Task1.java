package Task1;

import java.util.Scanner;

/**
 * - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * - Использовать комментарии и JavaDoc при описании метода.
 * - Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 * Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */

public class Task1 {
    public static void main(String[] args) {
        double firstNumber, secondNumber;
        String operation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число:");
        secondNumber = scanner.nextDouble();
        System.out.println("Введите один из символов '+', '-', '*' или '/'");
        operation = scanner.next();

        switch(operation) {
            case "+":
                sum(firstNumber, secondNumber);
                break;
            case "-":
                difference(firstNumber, secondNumber);
                break;
            case "*":
                multiplication(firstNumber, secondNumber);
                break;
            case "/":
                division(firstNumber, secondNumber);
                break;
        }
    }

    /**
     * Метод для сложения двух дробных чисел, введенных пользователем.
     * @param firstNumber - первое число, введенное пользователем.
     * @param secondNumber - второе число, введенное пользователем.
     */
    public static void sum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.printf("%.4f", result);
    }

    public static void difference(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.printf("%.4f", result);
    }

    public static void multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("%.4f", result);
    }

    public static void division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        System.out.printf("%.4f", result);
    }
}