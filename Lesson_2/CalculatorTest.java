import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Калькулятор");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isContinued = false;

        // Запуск итерации расчёта
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            boolean isSignCorrect = false;
            char sign = ' ';

            // Ввести и проверить знак
            do {
                System.out.print("Введите знак математической операции: ");
                sign = scanner.next().charAt(0);
            } while (!calculator.checkSign(sign));

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            // Выполнить расчёт (в формате используем %s для красивого вывода результата)
            double result = calculator.performCalculation(num1, sign, num2);
            System.out.printf("%d %s %d = %s\n", num1, sign, num2, result); //

            // Продолжить выполнение?
            boolean isAnswerCorrect = true;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                String userAnswer = scanner.next();
                isAnswerCorrect = true;
                if (userAnswer.equals("yes"))
                    isContinued = true;
                else if (userAnswer.equals("no"))
                    isContinued = false;
                else
                    isAnswerCorrect = false;
            } while (!isAnswerCorrect);
        } while (isContinued);
    }
}