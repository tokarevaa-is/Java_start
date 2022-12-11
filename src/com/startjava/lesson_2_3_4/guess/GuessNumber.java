package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    public static final int attemptLimit = 10;
    public static final int roundLimit = 3;
    public static final int playersCount = 3;
    private int secretNumber;
    private Player[] players;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {

        this.players = Arrays.copyOf(players, players.length);

        for (int i = players.length - 1; i > 0; i--) {
            int replacedIndex = (int) (Math.random() * 10 % i);
            Player playerBuffer = this.players[i];
            this.players[i] = this.players[replacedIndex];
            this.players[replacedIndex] = playerBuffer;
        }
    }

    public void start() {
        for (int i = 0; i < roundLimit; i++) {
            for (Player player : players)
                player.clear();

            secretNumber = ((int) (Math.random() * 100)) + 1;
            System.out.println("Число загадано.");
//            System.out.println(secretNumber);
            Player activePlayer = null;
            boolean answerCorrect;
            int playerIndex = -1;

            // Игроки по очереди пытаются угадать число
            do {
                playerIndex++;
                activePlayer = players[(playerIndex % playersCount)];

                System.out.printf("Ход игрока %s. Отгадай число: ", activePlayer.getName());
                activePlayer.addNumber(scanner.nextInt());
                answerCorrect = isNumbersEquals(activePlayer.getNumber());

                if (answerCorrect) {
                    System.out.printf("Игрок %s угадал число %d c %d попытки.\n",
                            activePlayer.getName(), activePlayer.getNumber(), activePlayer.getAttemptCount());
                    activePlayer.setWin();
                    break;
                }

                if (activePlayer.getAttemptCount() == attemptLimit)
                    System.out.printf("У %s закончились попытки", activePlayer.getName());
            } while (players[playersCount - 1].getAttemptCount() <= attemptLimit);

            // Вывести все введёные числа
            for (Player player : players)
                printNumbers(player.getNumbers());
        }

        // Определение результатов
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < players.length - 1; i++) {
                if (players[i].getWin() < players[i + 1].getWin()) {
                    Player player = players[i];
                    players[i] = players[i + 1];
                    players[i + 1] = player;
                    sorted = false;
                }
            }
        }

        System.out.printf("Победитель по результатам %d раундов: %s\n",
                roundLimit, players[0].getName());
    }

    // Проверка предложенного варианта
    private boolean isNumbersEquals(int assumedNumber) {
        if (assumedNumber == secretNumber)
            return true;

        System.out.printf("Число %d %s того, что загадал компьютер\n",
                assumedNumber, (assumedNumber < secretNumber ? "меньше" : "больше"));
        return false;
    }

    private void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}