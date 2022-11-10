public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");

        int coreRevision = 5;
        byte coreCount = 4;
        long diskCapacity = 255_786_441_728L;
        short model = 12_700;
        float diskFreeSpace = 42.62f;
        double cpuLoad = 6.626_070;
        char mountedDisk = 'C';
        boolean isWorking = true;

        System.out.println("Intel Core i" + coreRevision);
        System.out.println("Core Count: " + coreCount);
        System.out.println("Disk Capacity (byte): " + diskCapacity);
        System.out.println("CPU Model: " + model);
        System.out.println("Disk Free space (Gb): " + diskFreeSpace);
        System.out.println("CPU Load (%): " + cpuLoad);
        System.out.println("Mounted Disk: " + mountedDisk);
        System.out.println("CPU is ON: " + isWorking);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        double discountPrice = (pricePen + priceBook) * (100 - discount) / 100;
        double totalDiscount = (pricePen + priceBook) - discountPrice;
        System.out.println("Сумма скидки: " + totalDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");

        // Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        int intMax = Integer.MAX_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("Integer Maximum: " + intMax + "," + (++intMax) + "," + (--intMax));
        System.out.println("Byte Maximum: " + byteMax + "," + (++byteMax) + "," + (--byteMax));
        System.out.println("Short Maximum: " + shortMax + "," + (++shortMax) + "," + (--shortMax));
        System.out.println("Long Maximum: " + longMax + "," + (++longMax) + "," + (--longMax));

        // Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int buffer = num2;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("A: " + num1 + ", B: " + num2);
        num2 = num1;
        num1 = buffer;
        System.out.println("A: " + num1 + ", B: " + num2);

        System.out.println("\nПерестановка с помощью арифметических операций:");
        System.out.println("A: " + num1 + ", B: " + num2);
        num1 -= num2;
        num2 += num1;
        num1 =  num2 - num1;
        System.out.println("A: " + num1 + ", B: " + num2);

        System.out.println("\nПерестановка с помощью побитовой операции:");
        System.out.println("A: " + num1 + ", B: " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("A: " + num1 + ", B: " + num2);

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
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = (srcNum /10) % 10;
        int ones = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");

        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + openBracket + " " + closeBracket + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backSlash + underscore + underscore + backSlash);

        // Вывод произведения и суммы цифр числа
        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum = 345;
        hundreds = srcNum / 100;
        tens = (srcNum /10) % 10;
        ones = srcNum % 10;
        int sumDigits = hundreds + tens + ones;
        int productDigits = hundreds * tens * ones;
        System.out.println("Сумма цифр числа " + srcNum + " = " + sumDigits);
        System.out.println("Произведение цифр числа " + srcNum + " = " + productDigits);

        // Вывод времени
        System.out.println("\n10. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minuts = (time % 3600 ) / 60;
        int seconds = time % 60;
        System.out.println(time + " секунд = " + hours + ":" + minuts + ":" + seconds);
    }
}