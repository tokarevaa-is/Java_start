package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private int[] numbers = new int[GuessNumber.ATTEMPT_LIMIT];
    private int attemptCount;
    private int win;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getNumber() {
        return numbers[attemptCount - 1];
    }
    
    public void addNumber(int number) {
        numbers[attemptCount] = validNumber(number);
        attemptCount++;
    }

    // Проверка введённого числа
    private int validNumber(int number) {
        int validNumber = number;
        if (validNumber <= 0 || validNumber > 100) {
            System.out.print("Число не находиться в интервале (0:100]. Повторите ввод: ");
            validNumber = validNumber(scanner.nextInt());
        }
        return validNumber;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptCount);
    }

    public int getWin() {
        return win;
    }

    public void setWin() {
        win++;
    }

    // Сбросить все значения
    public void clear() {
        if (attemptCount != 0)
            Arrays.fill(numbers, 0, attemptCount, 0);
        attemptCount = 0;
    }
}