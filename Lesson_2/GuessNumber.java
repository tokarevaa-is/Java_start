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
        secretNumber = ((int) (Math.random() * 100)) + 1;
        System.out.println("Число загадано.");
        Player activePlayer = player2;

        // Игроки по очереди пытаются угадать число
        do {
            activePlayer = (activePlayer == player1 ? player2 : player1);
            System.out.printf("Ход игрока %s. Отгадай число: ", activePlayer.getName());
            activePlayer.setNumber(scanner.nextInt());
        } while(!isValueEquals(activePlayer.getNumber()));

        System.out.printf("Игрок %s победил!\n", activePlayer.getName());
    }

    // Проверка предложенного варианта
    private boolean isValueEquals(int assumedNumber) {
        if (assumedNumber == secretNumber)
            return true;
        else if (assumedNumber < secretNumber)
            System.out.printf("Число %d меньше того, что загадал компьютер\n", assumedNumber);
        else
            System.out.printf("Число %d больше того, что загадал компьютер\n", assumedNumber);
        return false;
    }
}
