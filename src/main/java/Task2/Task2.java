package Task2;

import java.util.Scanner;

/**
 * 1. Реализовать операции сложения, вычитания, умножения и деления для калькулятора из предыдущего задания

 * 2. Поиск максимального элемента в массиве:
 * - задаем массив слов
 * - размерность массива произвольна, задается в консоли
 * - после чего в консоли вводятся слова в количестве равном заданной длине массива
 * - в полученном массиве необходимо найти самое длинное слово
 * - результат вывести на консоль

 * 3. Программа должна выполнять одно из заданий на выбор.
 * - Если в консоли ввести 1 - запуститься выполнение калькулятора
 * - Если в консоли ввести 2 - поиск максимального слова в массиве

 * Пример как это может выглядеть в консоли:
 * Enter number of task: (1 - calculator, 2 - string array)
 * 1
 * Enter the first number
 * 3
 * ....
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задачи: (1 - калькулятор, 2 - поиск максимального слова в массиве): ");
        int task = scanner.nextInt();

        if (task == 1) {
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();
            System.out.println("Введите один из символов '+', '-', '*' или '/'");
            String operation = scanner.next();

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
        } else if (task == 2) {
            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();
            String[] words = new String[size];

            System.out.println("Введите слова: ");
            for (int i = 0; i < size; i++) {
                words[i] = scanner.next();
            }

            int maxLength = 0;
            String longestWord = "";

            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово: " + longestWord);
        }

        scanner.close();
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
