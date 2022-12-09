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

        // Выполнить расчёт (в формате используем %s для красивого вывода результата)
        System.out.printf("Результат: %s\n", calculator.calculate(expression)); //

        // Продолжить выполнение?
        return isNext();
    }

    private static boolean isNext() {
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