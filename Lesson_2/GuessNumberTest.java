import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean answerCorrect = false;

        // Инициализация игроков
        System.out.print("Введите имя игрока 1: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя игрока 2: ");
        Player player2 = new Player(scanner.next());

        do {
            // Инициируем новый раунд
            GuessNumber playRound = new GuessNumber();
            System.out.println("Число загадано.");
            Player activePlayer = player1;

            // Игроки по очереди пытаются угадать число
            while (!answerCorrect) {

                System.out.printf("Ход игрока %s. Отгадай число: ", activePlayer.getName());
                activePlayer.setNumber(scanner.nextInt());
                answerCorrect = playRound.isValueEquals(activePlayer.getNumber());

                if (answerCorrect)
                    System.out.printf("Игрок %s победил!\n", activePlayer.getName());
                else
                    activePlayer = (activePlayer == player1 ? player2 : player1);
            }

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