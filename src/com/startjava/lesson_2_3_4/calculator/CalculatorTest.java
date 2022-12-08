package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор");

        // Запуск калькуляции
        run();
    }

    private static void run() {
        if (calculate())
            run();
    }

    private static boolean calculate() {
        Calculator calculator = new Calculator();
        System.out.print("Введите математическое выражение: ");
        String expression = scanner.nextLine();
        calculator.setExpression(expression);

        // Выполнить расчёт (в формате используем %s для красивого вывода результата)
        double result = calculator.calculate();
        System.out.printf("Результат: %s\n", result); //

        // Продолжить выполнение?
        return continueCalculation();
    }

    private static boolean continueCalculation() {
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals("yes"))
                return true;
            else if (userAnswer.equals("no"))
                return false;
        } while (true);
    }
}