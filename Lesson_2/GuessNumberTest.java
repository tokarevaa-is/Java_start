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
            game.runGame();

            // Продолжить выполнение?
        } while (checkResumeGame());
    }

    // Продолжить или прервать игру
    private static boolean checkResumeGame() {
        boolean isAnswerCorrect = true;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals("yes"))
                return true;
            else if (userAnswer.equals("no"))
                return false;
            else
                isAnswerCorrect = false;
        } while (!isAnswerCorrect);
        return false;
    }
}