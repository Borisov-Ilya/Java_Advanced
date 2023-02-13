package Task4.Calculator;

import java.util.Scanner;

/**
 * Выражения для калькулятора
 */
public class Calculator {
    Scanner scanner = new Scanner(System.in);
    Logic logic = new Logic();

    public void run() {
        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите один из символов '+', '-', '*' или '/'");
        String symbol = scanner.next();
        scanner.close();
        logic.getResult(firstNumber, secondNumber, symbol);
    }
}

