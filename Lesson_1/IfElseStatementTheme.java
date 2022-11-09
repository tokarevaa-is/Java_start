public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Перевод псевдокода на язык Java (это название задачи)
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
        int age = 18;
        boolean isSexMale = true;
        double height = 1.85;

        if (age > 20) {
            System.out.println("Набор в сборную по баскетблоу недоступен лицам старше 20 лет");
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
        int intA = 5;
        int intB = 12;
        if (intA < intB) {
            System.out.println("Max: " + intB + ", Min :" + intA);
        } else if (intA > intB) {
            System.out.println("Max: " + intA + ", Min :" + intB);
        } else {
            System.out.println("Переменные равны: " + intA);
        }

        // Работа с числом
        System.out.println("\n3. Работа с числом");
        int srcNum = 57;
        System.out.println("Число: " + srcNum);
        if (srcNum != 0) {
            if (srcNum % 2 == 0)
                System.out.println("Число чётное");
            else
                System.out.println("Число нечётное");

            if (srcNum > 0)
                System.out.println("Число положительное");
            else
                System.out.println("Число отрицательное");
        }

        // Поиск одинаковых цифр в числах
        System.out.println("\n 4. Поиск одинаковых цифр в числах");
        int num1 = 325;
        int num2 = 345;
        boolean isFounded = false;
        System.out.println("Числа " + num1 + " и " + num2);
        int intChar1;
        int intChar2;
        intChar1 = num1 / 100;
        intChar2 = num2 / 100;
        if (intChar1 == intChar2) {
            System.out.println("Одинаковое число " + intChar2 + " в разряде 1");
            isFounded = true;
        }
        intChar1 = (num1 % 100) / 10;
        intChar2 = (num2 % 100) / 10;
        if (intChar1 == intChar2) {
            System.out.println("Одинаковое число " + intChar2 + " в разряде 2");
            isFounded = true;
        }
        intChar1 = num1 % (num1 / 10 );
        intChar2 = num2 % (num2 / 10 );
        if (intChar1 == intChar2) {
            System.out.println("Одинаковое число " + intChar2 + " в разряде 3");
            isFounded = true;
        }

        if (!isFounded)
            System.out.println("Одинаковых чисел на идентичных разрядах не найдено");

        // Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0058';
        System.out.println("Символ: " + symbol);
        if (symbol >= '0' && symbol <= '9')
            System.out.println("Символ является числом");
        else if (symbol >= 'a' && symbol <= 'z')
            System.out.println("Символ является строчной буквой");
        else if (symbol >= 'A' && symbol <= 'Z')
            System.out.println("Символ является прописной буквой");
        else
            System.out.println("Символ не является ни буквой ни числом");

        // Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300_000;
        double percent;
        double percentSum;
        double total;
        if (deposit < 100_000)
            percent = 5.0;
        else if (deposit >= 100_000 && deposit <= 300_000)
            percent = 7.0;
        else
            percent = 10.0;
        percentSum = deposit * (percent / 100.0);
        total = deposit + percentSum;
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный процент: " + percentSum + " (" + percent + "%)");
        System.out.println("Сумма с процентом: " + total);

        // Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percHistory = 59;
        int percProgram = 91;
        int markHistory;
        int markProgram;
        if (percHistory <= 60)
            markHistory = 2;
        else if (percHistory < 73)
            markHistory = 3;
        else if (percHistory < 91)
            markHistory = 4;
        else
            markHistory = 5;

        if (percProgram <= 60)
            markProgram = 2;
        else if (percProgram < 74)
            markProgram = 3;
        else if (percProgram < 92)
            markProgram = 4;
        else
            markProgram = 5;
        System.out.println(markHistory + " - История");
        System.out.println(markProgram + " - Программирование");
        System.out.println(((markHistory + markProgram ) / 2.0) + " - Средний балл оценок");
        System.out.println(((percHistory + percProgram ) / 2.0) + " - Средний % по предметам");

        // Расчет прибыли
        System.out.println("\n8. Расчет прибыли");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int sum;
        sum = (sale - rent - costPrice) * 12;
        System.out.println("Прибыль за год: " + sum + " руб.");

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
        // System.out.println(count100 + " / " + cash + " / " + released100);
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
        // System.out.println(count10 + " / " + cash + " / " + released10);
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
        // System.out.println(count1 + " / " + cash + " / " + released1);
        cash -= released1;

        if (isReleased) {
            System.out.println("Отпущено: 1 - " + released1 + 
                    ", 10 - " + released10 + 
                    ", 100 - " + released100);
        }
    }
}