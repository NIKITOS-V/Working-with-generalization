import Task_1.Calculator;
import Task_2.ArraysCalculator;
import Task_3.Pair;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printTask_1(12, 3.5f);

        System.out.println();

        printTask_2();

        System.out.print(
                new Pair<Integer, Boolean>(124, false)
        );
    }

    private static <T extends Number> void printTask_1(T firstNumber, T secondNUmber){
        System.out.printf(
                "%s + %s = %s\n",
                firstNumber,
                secondNUmber,
                Calculator.sum(
                        firstNumber,
                        secondNUmber
                )
        );

        System.out.printf(
                "%s - %s = %s\n",
                firstNumber,
                secondNUmber,
                Calculator.subtract(
                        firstNumber,
                        secondNUmber
                )
        );

        System.out.printf(
                "%s * %s = %s\n",
                firstNumber,
                secondNUmber,
                Calculator.multiply(
                        firstNumber,
                        secondNUmber
                )
        );

        System.out.printf(
                "%s / %s = %s\n",
                firstNumber,
                secondNUmber,
                Calculator.divide(
                        firstNumber,
                        secondNUmber
                )
        );
    }

    private static void printTask_2(){
        Integer[] integers_1 = {1, 2, 3, 4, 5, 6};

        Float[] floats = {1f, 2f, 3f, 4f, 5f, 6f};

        Integer[] integers_2 = {2, 3, 4, 5, 6, 7};

        System.out.println(
                getStrongFormat(integers_1, integers_2)
        );

        System.out.println(
                getStrongFormat(integers_1, floats)
        );

        System.out.println(
                getStrongFormat(integers_2, floats)
        );
    }

    private static <T> String getStrongFormat(T[] firstArray, T[] secondArray){
        return String.format(
               "comparison:\n\t%s\n\t%s\nresult: %s\n",
               Arrays.toString(firstArray),
               Arrays.toString(secondArray),
               ArraysCalculator.compareArrays(
                       firstArray,
                       secondArray
               )
        );
    }
}