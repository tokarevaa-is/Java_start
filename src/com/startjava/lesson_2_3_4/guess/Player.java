package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int tryCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTryCount() {
        return tryCount;
    }

    public int getNumber() {
        return numbers[tryCount - 1];
    }
    
    public void setNumber(int number) {
        tryCount++;
        numbers[tryCount - 1] = number;
    }

    // Вывести все элементы массива
    public int[] getPlayerNumber() {
        return Arrays.copyOf(numbers, tryCount);
    }

    // Сбросить все значения
    public void refresh() {
        if (tryCount != 0)
            Arrays.fill(numbers, 0, tryCount, 0);
        tryCount = 0;
    }
}
