public class GuessNumber {
    private int puzzledNumber;

    public GuessNumber() {
        this(((int) (Math.random() * 100)) + 1);
    }

    public GuessNumber(int newNumber) {
        puzzledNumber = newNumber;
    }

    // Проверка предложенного варианта
    public boolean isValueEquals(int value) {
        if (value == puzzledNumber)
            return true;
        else if (value < puzzledNumber)
            System.out.printf("Число %d меньше того, что загадал компьютер\n", value);
        else
            System.out.printf("Число %d больше того, что загадал компьютер\n", value);

        return false;
    }
}
