public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра ''Угадай число''");
        int randomNumber = ((int) (Math.random() * 100) % 99) + 1;
        int playerNumber = 1;
        int step = 50;
        while (playerNumber != randomNumber) {
            step = (step > 1) ? (step / 2) : 1;
            if (playerNumber < randomNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер\n", playerNumber);
                playerNumber += step;
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер\n", playerNumber);
                playerNumber -= step;
            }
        }
        System.out.println("Вы угадали! Число: " + playerNumber);
    }
}