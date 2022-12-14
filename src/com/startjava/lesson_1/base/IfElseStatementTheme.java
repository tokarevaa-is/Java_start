package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 18;
        boolean isSexMale = true;
        double height = 1.85;

        if (age > 20) {
            System.out.println("Набор в сборную по баскетболу недоступен лицам старше 20 лет");
        } else {
            System.out.println("Заявка на вступление в сборную принята");
        }

        if (!isSexMale) {
            System.out.println("Заявка принята в женскую сборную");
        } else {
            System.out.println("Заявка принята в мужскую сборную");
        }

        if (height < 1.80) {
            System.out.println("Вы приняты в команду запасных");
        } else {
            System.out.println("Вы приняты в основную команду");
        }

        char firstNameLetter = "Имя" .charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Вы находитесь в 1 очереди");
        } else if (firstNameLetter == 'I') {
            System.out.println("Вы находитесь во 2 очереди");
        } else {
            System.out.println("Вы находитесь в 3 очереди");
        }

        // Поиск max и min числа
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 5;
        int num2 = 12;
        if (num1 < num2) {
            System.out.println("Max: " + num2 + ", Min :" + num1);
        } else if (num1 > num2) {
            System.out.println("Max: " + num1 + ", Min :" + num2);
        } else {
            System.out.println("Переменные равны: " + num1);
        }

        // Работа с числом
        System.out.println("\n3. Работа с числом");
        int srcNum = 57;
        System.out.println("Число: " + srcNum);
        if (srcNum != 0) {
            if (srcNum % 2 == 0)
                System.out.println("Чётное");
            else
                System.out.println("Нечётное");

            if (srcNum > 0)
                System.out.println("Положительное");
            else
                System.out.println("Отрицательное");
        }

        // Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 325;
        num2 = 345;
        boolean equals = false;
        System.out.println("Числа " + num1 + " и " + num2);

        // Ищем сотни
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковое число " + hundreds2 + " в разряде 1");
            equals = true;
        }

        // Ищем десятки
        int tens1 = num1 / 10 % 10;
        int tens2 = num2 / 10 % 10;
        if (tens1 == tens2) {
            System.out.println("Одинаковое число " + tens2 + " в разряде 2");
            equals = true;
        }

        // Ищем единицы
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        if (ones1 == ones2) {
            System.out.println("Одинаковое число " + ones2 + " в разряде 3");
            equals = true;
        }

        if (!equals)
            System.out.println("Одинаковых чисел на идентичных разрядах не найдено");

        // Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknownSymbol = '\u0058';
        System.out.println("Символ: " + unknownSymbol);
        if (unknownSymbol >= '0' && unknownSymbol <= '9')
            System.out.println("Является числом");
        else if (unknownSymbol >= 'a' && unknownSymbol <= 'z')
            System.out.println("Является строчной буквой");
        else if (unknownSymbol >= 'A' && unknownSymbol <= 'Z')
            System.out.println("Является прописной буквой");
        else
            System.out.println("Не является ни буквой ни числом");

        // Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300_000;
        double percentent = 10.0;
        if (deposit < 100_000)
            percentent = 5.0;
        else if (deposit >= 100_000 && deposit <= 300_000)
            percentent = 7.0;

        double percententSum = deposit * (percentent / 100.0);
        double total = deposit + percententSum;

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + percententSum + " (" + percentent + "%)");
        System.out.println("Сумма с процентом: " + total);

        // Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgram = 91;
        int gradeHistory = 5;
        int gradeProgram = 5;
        if (percentHistory <= 60)
            gradeHistory = 2;
        else if (percentHistory < 73)
            gradeHistory = 3;
        else if (percentHistory < 91)
            gradeHistory = 4;

        if (percentProgram <= 60)
            gradeProgram = 2;
        else if (percentProgram < 74)
            gradeProgram = 3;
        else if (percentProgram < 92)
            gradeProgram = 4;
        System.out.println(gradeHistory + " - История");
        System.out.println(gradeProgram + " - Программирование");
        System.out.println(((gradeHistory + gradeProgram ) / 2.0) + " - Средний балл оценок");
        System.out.println(((percentHistory + percentProgram ) / 2.0) + " - Средний % по предметам");

        // Расчет прибыли
        System.out.println("\n8. Расчет прибыли");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int sum = (sale - rent - costPrice) * 12;
        char sign = '+';
        if (sum < 0)
            System.out.printf("Прибыль за год: %d  руб.", sum);
        else
            System.out.printf("Прибыль за год: %c%d руб.", sign, sum);

        // Подсчет количества банкнот
        System.out.println("\n9. Подсчет количества банкнот");
        int cash = 567;
        sum = cash;
        int count1 = 50;
        int count10 = 5;
        int count100 = 10;
        int banknotesReleased1 = 50;
        int banknotesReleased10 = 5;
        int banknotesReleased100 = 10;
        boolean isReleased = true;

        int banknotesRequired1 = cash % 10;
        int banknotesRequired10 = (cash / 10) % 10;
        int banknotesRequired100 = cash / 100;

        // System.out.println("Номиналы: 1 - " + count1 + 
        //         ", 10 - " + count10 + 
        //         ", 100 - " + count100);
        System.out.println("Номиналы: 1, 10, 100");
        // System.out.println("Требуется: 1 - " + (cash % (cash / 10 )) + 
        //         ", 10 - " + ((cash % 100) / 10) + 
        //         ", 100 - " + banknotesRequired100);

        // Выдаём 100.
        // Проверить, хватает ли 100 купюр
        if (banknotesRequired100 < count100) {
            banknotesReleased100 = banknotesRequired100;
            count100 -= banknotesRequired100;
        } else {
            // Если нет - отдаём все 100
            banknotesReleased100 = count100;
            count100 = 0;
        }
        cash -= (banknotesReleased100 * 100);

        // Выдаём 10
        // Проверить, хватает ли 10 купюр
        if ((cash / 10 ) < count10) {
            banknotesReleased10 = (cash / 10 );
            count10 -= (cash / 10 );
        } else {
            // Если нет - отдаём все 10
            banknotesReleased10 = count10;
            count10 = 0;
        }
        cash -= (banknotesReleased10 * 10);

        // Выдаём 1
        // Проверить, хватает ли 1 купюр
        if (cash < count1) {
            banknotesReleased1 = cash;
            count1 -= cash;
        } else {
            System.out.println("Не удаётся выдать запрашиваемую сумму");
            isReleased = false;
        }
        cash -= banknotesReleased1;

        if (isReleased) {
            // System.out.println("Отпущено: 1 - " + banknotesReleased1 + 
            System.out.println("Требуется: 1 - " + banknotesReleased1 + 
                    ", 10 - " + banknotesReleased10 + 
                    ", 100 - " + banknotesReleased100);
            System.out.println("Сумма выдачи: " + sum);
        }
    }
}