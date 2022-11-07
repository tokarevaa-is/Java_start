
public class VariablesTheme {
    public static void main(String[] args) {
        // Вывод значений переменных на консоль
        System.out.println("1. Вывод значений переменных на консоль");

        int intVariable = 5;
        byte byteVariable = 4;
        long longVarable = -987_654_321L;
        short shortVariabe = 12_700;
        float floatVariable = 7.62f;
        double doubleVariable = 6.626_070;
        char charVariable = 'C';
        boolean boolVariable = true;

        // Вывод переменных на экран
        System.out.println("Integer Variable: " + intVariable);
        System.out.println("Byte Variable: " + byteVariable);
        System.out.println("Long Variable: " + longVarable);
        System.out.println("Short Variable: " + shortVariabe);
        System.out.println("Float Variable: " + floatVariable);
        System.out.println("Double Variable: " + doubleVariable);
        System.out.println("Char Variable: " + charVariable);
        System.out.println("Boolean Variable: " + boolVariable);

        // Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        double totalDiscount, totalGoods;
        totalGoods = (pricePen + priceBook) * (100 - discount) / 100;
        totalDiscount = (pricePen + priceBook) - totalGoods;
        System.out.println("Сумма скидки: " + totalDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + totalGoods);

        // Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");

        // Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("Integer Maximum: " + intMax + "," + (intMax + 1) + "," + (intMax - 1));
        System.out.println("Integer Minimum: " + intMin + "," + (intMin + 1) + "," + (intMin - 1));
        System.out.println("Byte Maximum: " + byteMax + "," + (byte)(byteMax + 1) + "," + (byte)(byteMax - 1));
        System.out.println("Byte Minimum: " + byteMin + "," + (byte)(byteMin + 1) + "," + (byte)(byteMin - 1));
        System.out.println("Short Maximum: " + shortMax + "," + (short)(shortMax + 1) + "," + (short)(shortMax - 1));
        System.out.println("Short Minimum: " + shortMin + "," + (short)(shortMin + 1) + "," + (short)(shortMin - 1));
        System.out.println("Long Maximum: " + longMax + "," + (long)(longMax + 1) + "," + (long)(longMax - 1));
        System.out.println("Long Minimum: " + longMin + "," + (long)(longMin + 1) + "," + (long)(longMin - 1));

        // Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int intA = 2;
        int intB = 5;
        int intBuffer;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("A: " + intA + ", B: " + intB);
        intBuffer = intB;
        intB = intA;
        intA = intBuffer;
        System.out.println("A: " + intA + ", B: " + intB);

        System.out.println("\nПерестановка с помощью арифметических операций:");
        System.out.println("A: " + intA + ", B: " + intB);
        intA += intB;
        intB -= intA;
        intB *= (-1);
        intA -= intB;
        System.out.println("A: " + intA + ", B: " + intB);

        System.out.println("\nПерестановка с помощью побитовой операции:");
        System.out.println("A: " + intA + ", B: " + intB);
        intA ^= intB;
        intB ^= intA;
        intA ^= intB;
        System.out.println("A: " + intA + ", B: " + intB);

        // Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.println((int) char35 + ": " + char35);
        System.out.println((int) char38 + ": " + char38);
        System.out.println((int) char64 + ": " + char64);
        System.out.println((int) char94 + ": " + char94);
        System.out.println((int) char95 + ": " + char95);

        // Вывод количества сотен, десятков и единиц числа
        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int value = 123;
        int valHundred = value / 100;
        int valDec = (value % 100) / 10;
        int val = value % (value / 10 );
        System.out.println("Число " + value + " содержит:");
        System.out.println(valHundred + " сотен");
        System.out.println(valDec + " десятков");
        System.out.println(val + " единиц");

        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char slashBack = '\\';
        char underscore = '_';
        char bracketOpen = '(';
        char bracketClose = ')';
        System.out.println("    " + slash + slashBack);
        System.out.println("   " + slash + "  " + slashBack);
        System.out.println("  " + slash + underscore + bracketOpen + " " + bracketClose + slashBack);
        System.out.println(" " + slash + "      " + slashBack);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
            slashBack + underscore + underscore + slashBack);

        // Вывод произведения и суммы цифр числа
        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        value = 345;
        valHundred = value / 100;
        valDec = (value % 100) / 10;
        val = value % (value / 10 );
        int sumOfNumbers = valHundred + valDec + val;
        int multiplyOfNumbers = valHundred * valDec * val;
        System.out.println("Сумма цифр числа " + value + " = " + sumOfNumbers);
        System.out.println("Произведение цифр числа " + value + " = " + multiplyOfNumbers);

        // Вывод времени
        System.out.println("\n10. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minuts = (time % 3600 ) / 60;
        int seconds = time % (time / 60);
        System.out.println(time + " секунд = " + hours + ":" + minuts + ":" + seconds);
    }
 }