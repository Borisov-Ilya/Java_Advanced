package Task7.Calculator;

/**
 * Класс описывает логику работы калькулятора
 */
public class Logic {
    private double result = 0;

    protected double getResult(double firstNumber, double secondNumber, String symbol) {
        try {
            switch (symbol) {
                case "+": {
                    result = addition(firstNumber, secondNumber);
                    print();
                    break;
                }
                case "-": {
                    result = subtraction(firstNumber, secondNumber);
                    print();
                    break;
                }
                case "*": {
                    result = multiplication(firstNumber, secondNumber);
                    print();
                    break;
                }
                case "/": {
                    if (secondNumber == 0) {
                        throw new ArithmeticException("На ноль делить нельзя");
                    } else {
                        result = division(firstNumber, secondNumber);
                        print();
                    }
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Операция невозможна. Символ = " + symbol);
        }
        return result;
    }

    private void print() {
        System.out.printf("Результат: %.4f", result);
    }

    /**
     * Метод для сложения двух дробных чисел, введенных пользователем.
     * @param firstNumber - первое число, введенное пользователем.
     * @param secondNumber - второе число, введенное пользователем.
     * @return Результат вычисления.
     */
    private double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
