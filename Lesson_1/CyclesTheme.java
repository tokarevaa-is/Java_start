public class CyclesTheme {
    public static void main(String[] args) {
        // Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int intA = -10;
        int intB = 21;
        int value = intA;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (value % 2 == 0) 
                sumEven += value;
            else
                sumOdd += value;

            value++;
        } while (value <= intB);
        System.out.println("В промежутке [" + intA + ", " + intB +
            "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        // Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int valueA = 10;
        int valueB = 5;
        int valueC = -1;
        int valueMax = 0;
        int valueMin = 0;

        // Определить максимальное и минимальное значение
        if (valueA > valueB) {
            valueMax = valueA;
            valueMin = valueB;
        } else {
            valueMax = valueB;
            valueMin = valueA;
        }
        if (valueMin > valueC)
            valueMin = valueC;

        // Вывести интервал
        for (int i = valueMax - 1; i > valueMin; i--) {
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
        intA = 1;
        intB = 24;
        int length = 5;
        int counter = 0;

        for (int i = intA; i < intB || counter != 0; i += 2) {
            counter++;
            if (i < intB)
                System.out.printf(" %2d", i);
            else
                System.out.printf(" %2d", 0);

            if (counter == length){
                System.out.printf("%n");
                counter = 0;
            }
        }

        // Проверка количества единиц на четность
        System.out.println("\n 5. Проверка количества единиц на четность");
        baseValue = 3242592;
        int findValue = 2;
        boolean isOdd = false;
        value = baseValue;

        while (value != 0) {
            if (value % 10 == findValue)
                isOdd = !isOdd;
            value /= 10;
        }
        if (isOdd)
            System.out.printf("Число %d содержит %d нечётное количество единиц", baseValue, findValue);
        else
            System.out.printf("Число %d содержит %d чётное количество единиц", baseValue, findValue);

        // Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        int iterator = 0;
        int intX;
        int intY;
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println("");

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

        intX = 3;
        intA = 0;
        iterator = 1;
        // Цикл по строкам
        do {
            intB = 0;

            // Цикл по столбцам
            do {
                intB++;
                System.out.print("*");
            } while (intB <= intA);
            System.out.println("");

            // Доходим до границы фигуры и возвращаемся
            if (intA == intX) {
                iterator *= (-1);
            }

            intA += iterator;
        } while (intA >= 0);

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
        value = baseValue;
        while (value != 0) {
            currentNumber = value % 10;
            reverseValue = reverseValue * 10 + currentNumber;
            value /= 10;
        }

        if (baseValue == reverseValue)
            System.out.printf("Число %d является палиндромом", baseValue);
        else
            System.out.printf("Число %d не является палиндромом", baseValue);

        // Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");
        intA = 0;
        intB = 0;
        int sumA = 0;
        int sumB = 0;
        baseValue = 123321;
        counter = 0;

        while ( counter < 6) {
            currentNumber = (baseValue / (int)Math.pow(10, (6 - (counter + 1)))) % 10;
            if (counter / 3 == 0) {
                // Обрабатываем первую тройку
                intA = intA * 10 + (currentNumber);
                sumA += currentNumber;
            } else {
                // Обрабатываем вторую тройку
                intB = intB * 10 + (currentNumber);
                sumB += currentNumber;
            }
            counter++;
        }

        System.out.printf("Сумма цифр %d = %d%n", intA, sumA);
        System.out.printf("Сумма цифр %d = %d%n", intB, sumB);
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