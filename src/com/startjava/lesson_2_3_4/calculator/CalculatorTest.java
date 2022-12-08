package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        scanner.reset();
        Calculator calculator = new Calculator();

        // Запуск итерации расчёта
        do {
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.nextLine();
            calculator.setExpression(expression);

            // Выполнить расчёт (в формате используем %s для красивого вывода результата)
            double result = calculator.calculate();
            System.out.printf("Результат: %s\n", result); //

            // Продолжить выполнение?
            if (!continueCalculation())
                return;
        } while (true);
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