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

    public void run() {
        if (gameRound())
            run();
    }

    public boolean gameRound() {

        player1.refresh();
        player2.refresh();
        secretNumber = ((int) (Math.random() * 100)) + 1;
        System.out.println("Число загадано.");
        Player activePlayer = player2;
        boolean answerCorrect = false;


        // Игроки по очереди пытаются угадать число
        do {
            activePlayer = (activePlayer == player1 ? player2 : player1);

            System.out.printf("Ход игрока %s. Отгадай число: ", activePlayer.getName());
            activePlayer.setNumber(scanner.nextInt());
            answerCorrect = isNumberCorrect(activePlayer.getNumber());

            if (answerCorrect) {
                System.out.printf("Игрок %s угадал число %d c %d попытки.\n",
                        activePlayer.getName(), activePlayer.getNumber(), activePlayer.getTryCount());
                break;
            }

            if (activePlayer.getTryCount() == 10)
                System.out.printf("У %s закончились попытки", activePlayer.getName());
        } while (player2.getTryCount() <= 10);

        // Вывести все введёные числа
        printNumbers(player1.getPlayerNumber());
        printNumbers(player2.getPlayerNumber());

        // Продолжить/прекратить игру
        return isContinued();
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

    // Продолжить или прервать игру
    private boolean isContinued() {
        String playerAnswer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.next();
        } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));

        return playerAnswer.equals("yes");
    }
}