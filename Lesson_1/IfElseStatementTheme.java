public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Перевод псевдокода на язык Java (это название задачи)
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
        boolean isFounded = false;
        System.out.println("Числа " + num1 + " и " + num2);

        // Ищем сотни
        int digit1 = num1 / 100;
        int digit2 = num2 / 100;
        if (digit1 == digit2) {
            System.out.println("Одинаковое число " + digit2 + " в разряде 1");
            isFounded = true;
        }

        // Ищем десятки
        digit1 = num1 / 10 % 10;
        digit2 = num2 / 10 % 10;
        if (digit1 == digit2) {
            System.out.println("Одинаковое число " + digit2 + " в разряде 2");
            isFounded = true;
        }

        // Ищем единицы
        digit1 = num1 % 10;
        digit2 = num2 % 10;
        if (digit1 == digit2) {
            System.out.println("Одинаковое число " + digit2 + " в разряде 3");
            isFounded = true;
        }

        if (!isFounded)
            System.out.println("Одинаковых чисел на идентичных разрядах не найдено");

        // Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknownSymbol = '\u0058';
        System.out.println("Символ: " + unknownSymbol);
        if (unknownSymbol >= '0' && unknownSymbol <= '9')
            System.out.println("Символ является числом");
        else if (unknownSymbol >= 'a' && unknownSymbol <= 'z')
            System.out.println("Символ является строчной буквой");
        else if (unknownSymbol >= 'A' && unknownSymbol <= 'Z')
            System.out.println("Символ является прописной буквой");
        else
            System.out.println("Символ не является ни буквой ни числом");

        // Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300_000;
        double percentent = 10.0;
        double percententSum = 0.0;;
        double total = 0.0;
        if (deposit < 100_000)
            percentent = 5.0;
        else if (deposit >= 100_000 && deposit <= 300_000)
            percentent = 7.0;

        percententSum = deposit * (percentent / 100.0);
        total = deposit + percententSum;

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
        int count1 = 50;
        int count10 = 5;
        int count100 = 10;
        int released1 = 50;
        int released10 = 5;
        int released100 = 10;
        boolean isReleased = true;
        System.out.println("Номиналы: 1 - " + count1 + 
                ", 10 - " + count10 + 
                ", 100 - " + count100);
        System.out.println("Требуется: 1 - " + (cash % (cash / 10 )) + 
                ", 10 - " + ((cash % 100) / 10) + 
                ", 100 - " + (cash / 100));

        // Выдаём 100.
        // Проверить, хватает ли 100 купюр
        if ((cash / 100 ) < count100) {
            released100 = (cash / 100 );
            count100 -= (cash / 100 );
        } else {
            // Если нет - отдаём все 100
            released100 = count100;
            count100 = 0;
        }
        cash -= (released100 * 100);

        // Выдаём 10
        // Проверить, хватает ли 10 купюр
        if ((cash / 10 ) < count10) {
            released10 = (cash / 10 );
            count10 -= (cash / 10 );
        } else {
            // Если нет - отдаём все 10
            released10 = count10;
            count10 = 0;
        }
        cash -= (released10 * 10);

        // Выдаём 1
        // Проверить, хватает ли 1 купюр
        if ((cash ) < count1) {
            released1 = cash;
            count1 -= cash;
        } else {
            System.out.println("Не удаётся выдать запрашиваемую сумму");
            isReleased = false;
        }
        cash -= released1;

        if (isReleased) {
            System.out.println("Отпущено: 1 - " + released1 + 
                    ", 10 - " + released10 + 
                    ", 100 - " + released100);
        }
    }
}