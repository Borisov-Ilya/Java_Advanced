package Task6.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    private String symbol;
    Logic logic = new Logic();

    public void run() {
        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Введите один из символов '+', '-', '*' или '/'");
        try {
            symbol = scanner.next("[+]|-|[*]|/$");
        } catch (InputMismatchException e) {
            System.out.println("Был введен неправильный символ");
        }
        scanner.close();
        logic.getResult(firstNumber, secondNumber, symbol);
    }
}

