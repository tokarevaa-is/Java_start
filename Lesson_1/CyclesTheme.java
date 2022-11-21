public class CyclesTheme {
    public static void main(String[] args) {
        // Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("В промежутке [" + startRange + ", " + endRange +
                "] сумма четных чисел = ");
        do {
            if (startRange % 2 == 0) 
                sumEven += startRange;
            else
                sumOdd += startRange;

            startRange++;
        } while (startRange <= endRange);
        System.out.print(sumEven + ", а нечетных = " + sumOdd + "\n");

        // Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        // Определить максимальное и минимальное значение
        if (min > max) {
            max = num2;
            min = num1;
        }
        if (min > num3)
            min = num3;

        // Вывести интервал
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originNum = 1234;
        int reverse = 0;
        int sumDigits = 0;
        while (originNum > 0) {
            int digit = originNum % 10;
            sumDigits += digit;
            reverse = reverse * 10 + digit;
            originNum /= 10;
        }
        System.out.println(reverse);
        System.out.println(sumDigits);

        // Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
        int length = 5;
        int counter = 0;

        for (int i = num1; i < num2 || counter > 0; i += 2) {
            counter++;
            if (i < num2)
                System.out.printf(" %2d", i);
            else
                System.out.printf(" %2d", 0);

            if (counter == length) {
                System.out.println();
                counter = 0;
            }
        }

        // Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность");
        originNum = 3242592;
        int find = 2;
        boolean isOdd = false;
        int copyOriginNum = originNum;

        while (copyOriginNum > 0) {
            if (copyOriginNum % 10 == find)
                isOdd = !isOdd;
            copyOriginNum /= 10;
        }
        if (isOdd)
            System.out.printf("Число %d содержит %d нечётное количество двоек%n", 
                    originNum, find);
        else
            System.out.printf("Число %d содержит %d чётное количество двоек%n", 
                    originNum, find);

        // Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        int coordinateX;
        int coordinateY;
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        // Треугольник 1
        coordinateX = coordinateY = 5;
        while (coordinateY > 0) {
            coordinateX = coordinateY;
            while (coordinateX > 0) {
                System.out.print("#");
                coordinateX--;
            }
            System.out.println();
            coordinateY--;
        }
        System.out.println();

        // Треугольник 2
        coordinateX = 3;
        num1 = 0;
        counter = 1;
        // Цикл по строкам
        do {
            num2 = 0;

            // Цикл по столбцам
            do {
                num2++;
                System.out.print("*");
            } while (num2 <= num1);
            System.out.println();

            // Доходим до границы фигуры и возвращаемся
            if (num1 == coordinateX) {
                counter *= (-1);
            }

            num1 += counter;
        } while (num1 >= 0);

        // Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        char symbol;
        byte acsiiInt = 0;

        // Выводим название столбцов
        System.out.printf("%4s %4s%n", "Dec", "Char");
        while (acsiiInt <= 'z') {
            symbol = (char) acsiiInt;

            // Выводим символы до цифр
            if (((acsiiInt < '0' && (acsiiInt % 2) == 1)) ||
                 (acsiiInt >= 'a' && acsiiInt <= 'z' && (acsiiInt % 2) == 1))
                System.out.printf("%4d %4c%n", acsiiInt, symbol);
            acsiiInt++;
        }

        // Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        originNum = 12344321;
        reverse = 0;
        copyOriginNum = originNum;
        while (copyOriginNum > 0) {
            int digit = copyOriginNum % 10;
            reverse = reverse * 10 + digit;
            copyOriginNum /= 10;
        }

        if (originNum == reverse)
            System.out.printf("Число %d является палиндромом", originNum);
        else
            System.out.printf("Число %d не является палиндромом", originNum);

        // Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");
        num1 = 0;
        num2 = 0;
        int sumA = 0;
        int sumB = 0;
        originNum = 123321;
        counter = 0;
        int numPart1 = num1 = originNum / 1000;
        int numPart2 = num2 = originNum % 1000;

        while (counter < 3) {
            int digitA = numPart1 % 10;
            int digitB = numPart2 % 10;

            numPart1 = numPart1 / 10;
            numPart2 = numPart2 / 10;

            sumA += digitA;
            sumB += digitB;

            counter ++;
        }

        System.out.printf("Сумма цифр %d = %d%n", num1, sumA);
        System.out.printf("Сумма цифр %d = %d%n", num2, sumB);
        if (sumA == sumB)
            System.out.println("Число является счастливым");
        else
            System.out.println("Число не является счастливым");

        // Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                // Выводим шапку
                if (i == 0) {
                    if (j == 0)
                        System.out.print("   ");
                    else if (j == 1)
                        System.out.printf("│");
                    else
                        System.out.printf("%3d", j);
                } else if (i == 1) {
                    // Чертим горизонтальные линии
                    if (j == 1)
                        System.out.print("┼──");
                    else 
                        System.out.print("───");
                } else {

                    // Вывод самой первой клетки
                    if (j == 0) {
                        // Выводим номера строк строк
                        System.out.printf("%3d", i);
                    } else if (j == 1) {
                        // Выводим вертикальные линии
                        System.out.print("│");
                    } else {
                        // Выводим содержимое таблицы
                        System.out.printf("%3d", (i * j));
                    }
                }
            }
            System.out.println();
        }
    }
}