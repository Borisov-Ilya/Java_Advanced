package Task4.Calculator;

/**
 * Класс описывает логику работы калькулятора
 */
public class Logic {
    protected void getResult(double firstNumber, double secondNumber, String symbol) {
        switch (symbol) {
            case "+": {
                addition(firstNumber, secondNumber);
                break;
            }
            case "-": {
                subtraction(firstNumber, secondNumber);
                break;
            }
            case "*": {
                multiplication(firstNumber, secondNumber);
                break;
            }
            case "/": {
                division(firstNumber, secondNumber);
                break;
            }
        }
    }

    /**
     * Метод для сложения двух дробных чисел, введенных пользователем.
     * @param firstNumber - первое число, введенное пользователем.
     * @param secondNumber - второе число, введенное пользователем.
     */
    private void addition(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.printf("Результат: %.4f", result);
    }

    private void subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.printf("Результат: %.4f", result);
    }

    private void multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("Результат: %.4f", result);
    }

    private void division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        System.out.printf("Результат: %.4f", result);
    }
}
