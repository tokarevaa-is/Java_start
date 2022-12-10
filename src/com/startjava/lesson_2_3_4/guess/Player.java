package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attemptCount;

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
        numbers[attemptCount] = number;
        attemptCount++;
    }

    // Вывести все элементы массива
    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptCount);
    }

    // Сбросить все значения
    public void clear() {
        if (attemptCount != 0)
            Arrays.fill(numbers, 0, attemptCount, 0);
        attemptCount = 0;
    }
}
