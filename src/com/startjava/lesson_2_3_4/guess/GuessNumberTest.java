package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Инициализация игроков
        System.out.printf("У каждого игрока по %d попыток\n", GuessNumber.ATTEMPT_LIMIT);

        Player[] players = new Player[GuessNumber.PLAYERS_COUNT];
        for (int i = 0; i < GuessNumber.PLAYERS_COUNT; i++) {
            System.out.printf("Введите имя игрока %d: ", i + 1);
            players[i] = new Player(scanner.next());
        }

        GuessNumber game = new GuessNumber(players);

        run(game);
    }

    public static void run(GuessNumber game) {
        game.start();
        if (isContinued())
            run(game);
    }

    // Продолжить или прервать игру
    private static boolean isContinued() {
        String playerAnswer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = scanner.next();
        } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));

        return playerAnswer.equals("yes");
    }
}