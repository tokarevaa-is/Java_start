import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Инициализация игроков
        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);

        do {
            // Инициируем новый раунд
            game.run();
            // Продолжить выполнение?
        } while (isExit());
    }

    // Продолжить или прервать игру
    private static boolean isExit() {
        boolean isAnswerCorrect = true;
        String userAnswer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            userAnswer = scanner.next();
        } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        
        if (userAnswer.equals("yes"))
            return true;
        return false;
    }
}