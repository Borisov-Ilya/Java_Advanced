package Task4.Calculator;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private String symbol;
    private double result;

    public Calculator() {
    }

    public Calculator(double firstNumber, double secondNumber, String symbol) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.symbol = symbol;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void count() {
        switch (symbol) {
            case "+": {
                result = firstNumber + secondNumber;
                break;
            }
            case "-": {
                result = firstNumber - secondNumber;
                break;
            }
            case "*": {
                result = firstNumber * secondNumber;
                break;
            }
            case "/": {
                if (secondNumber == 0) {
                    throw new ArithmeticException();
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            }
        }
    }
}

