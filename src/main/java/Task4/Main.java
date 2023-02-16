package Task4;

import Task4.Calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализовать калькулятор в стиле ООП.
 * Архитектуру приложения продумать самостоятельно.
 * Покрыть Unit тестами последний проект с калькулятором
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(scanner.nextDouble());
            System.out.println("Введите второе число:");
            calculator.setSecondNumber(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }

        try {
            System.out.println("Введите один из символов '+', '-', '*' или '/'");
            calculator.setSymbol(scanner.next("[+]|-|[*]|/$"));
        } catch (InputMismatchException e) {
            System.out.println("Был введен неправильный символ");
        }

        scanner.close();

        try {
            calculator.count();
            System.out.printf("Результат: %.4f", calculator.getResult());
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("Операция невозможна. Символ = " + calculator.getSymbol());
        }
    }
}