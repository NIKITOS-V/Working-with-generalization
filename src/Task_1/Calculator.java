package Task_1;

public class Calculator {
    private Calculator(){}

    public static <T extends Number> double sum(T firstNumber, T secondNUmber){
        return firstNumber.doubleValue() + secondNUmber.doubleValue();
    }

    public static <T extends Number> double subtract(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public static <T extends Number> double multiply(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public static <T extends Number> double divide(T firstNUmber, T secondNUmber) throws ArithmeticException{
        if (secondNUmber.doubleValue() == 0.0){
            throw new ArithmeticException("division by zero");
        }

        return firstNUmber.doubleValue() / secondNUmber.doubleValue();
    }
}
