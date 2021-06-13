package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDiffAndDiv(double first, double second) {
        return sum(difference(first, second), division(first, second));
    }

    public static double fourFunctions(double first, double second) {
        return sum(sumAndMultiply(first, second), sumDiffAndDiv(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDiffAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + fourFunctions(10, 20));
    }
}