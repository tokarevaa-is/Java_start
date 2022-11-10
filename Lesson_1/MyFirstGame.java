public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 99) + 1;
        int currentNumber = 1;
        int step = 50;
        int solution = 0;
        System.out.println("Игра ''Угадай число''");
        while (currentNumber != randomNumber) {
            step = (step == 0 || step == 1) ? 1 : (step / 2);
            if (currentNumber < randomNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", currentNumber);
                currentNumber += step;
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", currentNumber);
                currentNumber -= step;
            }
        }
        System.out.println("Вы угадали! Число: " + currentNumber);
    }
}