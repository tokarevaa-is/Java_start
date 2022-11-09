public class CyclesTheme {
    public static void main(String[] args) {
        // Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num1 = -10;
        int num2 = 21;
        int srcNum = num1;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (srcNum % 2 == 0) 
                sumEven += srcNum;
            else
                sumOdd += srcNum;

            srcNum++;
        } while (srcNum <= num2);
        System.out.println("В промежутке [" + num1 + ", " + num2 +
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        // Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        num1 = 10;
        num2 = 5;
        int num3 = -1;
        int maxValue = 0;
        int minValue = 0;

        // Определить максимальное и минимальное значение
        if (num1 > num2) {
            maxValue = num1;
            minValue = num2;
        } else {
            maxValue = num2;
            minValue = num1;
        }
        if (minValue > num3)
            minValue = num3;

        // Вывести интервал
        for (int i = maxValue - 1; i > minValue; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int baseValue = 1234;
        int reverseValue = 0;
        int sumBaseValue = 0;
        int currentNumber = 0;
        while (baseValue != 0) {
            currentNumber = baseValue % 10;
            sumBaseValue += currentNumber;
            reverseValue = reverseValue * 10 + currentNumber;
            baseValue /= 10;
        }
        System.out.println(reverseValue);
        System.out.println(sumBaseValue);

        // Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
        int length = 5;
        int counter = 0;

        for (int i = num1; i < num2 || counter != 0; i += 2) {
            counter++;
            if (i < num2)
                System.out.printf(" %2d", i);
            else
                System.out.printf(" %2d", 0);

            if (counter == length){
                System.out.printf("%n");
                counter = 0;
            }
        }

        // Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность");
        baseValue = 3242592;
        int findValue = 2;
        boolean isOdd = false;
        srcNum = baseValue;

        while (srcNum != 0) {
            if (srcNum % 10 == findValue)
                isOdd = !isOdd;
            srcNum /= 10;
        }
        if (isOdd)
            System.out.printf("Число %d содержит %d нечётное количество единиц%n", 
                    baseValue, findValue);
        else
            System.out.printf("Число %d содержит %d чётное количество единиц%n", 
                    baseValue, findValue);

        // Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        int iterator = 0;
        int intX;
        int intY;
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println("");

        // Треугольник 1
        intX = intY = 5;
        while (intY > 0) {
            intX = intY;
            while (intX > 0) {
                System.out.print("#");
                intX--;
            }
            System.out.print("\n");
            intY--;
        }
        System.out.println("");

        // Треугольник 2
        intX = 3;
        num1 = 0;
        iterator = 1;
        // Цикл по строкам
        do {
            num2 = 0;

            // Цикл по столбцам
            do {
                num2++;
                System.out.print("*");
            } while (num2 <= num1);
            System.out.println("");

            // Доходим до границы фигуры и возвращаемся
            if (num1 == intX) {
                iterator *= (-1);
            }

            num1 += iterator;
        } while (num1 >= 0);

        // Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        char symbol;
        byte acsiiInt = 0;

        // Выводим название столбцов
        System.out.printf("%4S %4S%n", "Dec", "Char");
        while (acsiiInt <= (int)'z' ){
            symbol = (char)acsiiInt;

            // Выводим символы до цифр
            if (((acsiiInt < (int)'0' && (acsiiInt % 2) == 1)) ||
                 (acsiiInt >= (int)'a' && acsiiInt <= (int)'z' && (acsiiInt % 2) == 1))
                System.out.printf("%4d %4c%n", (int)acsiiInt, symbol);
            acsiiInt++;
        }

        // Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        baseValue = 12344321;
        reverseValue = 0;
        srcNum = baseValue;
        while (srcNum != 0) {
            currentNumber = srcNum % 10;
            reverseValue = reverseValue * 10 + currentNumber;
            srcNum /= 10;
        }

        if (baseValue == reverseValue)
            System.out.printf("Число %d является палиндромом", baseValue);
        else
            System.out.printf("Число %d не является палиндромом", baseValue);

        // Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");
        num1 = 0;
        num2 = 0;
        int sumA = 0;
        int sumB = 0;
        baseValue = 123321;
        counter = 0;

        while ( counter < 6) {
            currentNumber = (baseValue / (int)Math.pow(10, (6 - (counter + 1)))) % 10;
            if (counter / 3 == 0) {
                // Обрабатываем первую тройку
                num1 = num1 * 10 + (currentNumber);
                sumA += currentNumber;
            } else {
                // Обрабатываем вторую тройку
                num2 = num2 * 10 + (currentNumber);
                sumB += currentNumber;
            }
            counter++;
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
                // Чертим горизонтальные линии
                if (i == 1) {
                    if (j == 1)
                        System.out.print("┼──");
                    else 
                        System.out.print("───");
                } else {
                    // Вывод самой первой клетки
                    if (i == 0 && j == 0) {
                        System.out.print("   ");
                    } else if (j == 0) {
                        // Выводим шапку строк
                        System.out.printf("%3d", i);
                    } else if (j == 1) {
                        // Выводим вертикальные линии
                        System.out.print("│");
                    } else if (i == 0) {
                        // выводим первый столбец
                        System.out.printf("%3d", j);
                    } else {
                        // Выводим содержимое таблицы
                        System.out.printf("%3d", (i * j));
                    }
                }
            }
            System.out.println("");
        }
    }
}