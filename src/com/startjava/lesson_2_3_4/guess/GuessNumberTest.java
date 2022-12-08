package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Инициализация игроков
        System.out.println("У каждого игрока по 10 попыток");
        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);

        game.run();
    }
}