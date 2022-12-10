package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gameRound() {

        player1.clear();
        player2.clear();
        secretNumber = ((int) (Math.random() * 100)) + 1;
        System.out.println("Число загадано.");
        Player activePlayer = player2;
        boolean answerCorrect = false;


        // Игроки по очереди пытаются угадать число
        do {
            activePlayer = (activePlayer == player1 ? player2 : player1);

            System.out.printf("Ход игрока %s. Отгадай число: ", activePlayer.getName());
            activePlayer.addNumber(scanner.nextInt());
            answerCorrect = isNumberCorrect(activePlayer.getNumber());

            if (answerCorrect) {
                System.out.printf("Игрок %s угадал число %d c %d попытки.\n",
                        activePlayer.getName(), activePlayer.getNumber(), activePlayer.getAttemptCount());
                break;
            }

            if (activePlayer.getAttemptCount() == 10)
                System.out.printf("У %s закончились попытки", activePlayer.getName());
        } while (player2.getAttemptCount() <= 10);

        // Вывести все введённые числа
        printNumbers(player1.getNumbers());
        printNumbers(player2.getNumbers());

    }

    // Проверка предложенного варианта
    private boolean isNumberCorrect(int assumedNumber) {
        if (assumedNumber == secretNumber)
            return true;
        else if (assumedNumber < secretNumber)
            System.out.printf("Число %d меньше того, что загадал компьютер\n", assumedNumber);
        else
            System.out.printf("Число %d больше того, что загадал компьютер\n", assumedNumber);
        return false;
    }

    private void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}