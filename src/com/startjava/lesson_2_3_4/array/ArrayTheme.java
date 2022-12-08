package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] arrayInt1 = {7, 4, 2, 5, 1, 3, 6};
        int length = arrayInt1.length;
        printArray(arrayInt1);
        for (int i = 0; i < length; i++, length--) {
            int buffer = arrayInt1[i];
            arrayInt1[i] = arrayInt1[length - 1];
            arrayInt1[length - 1] = buffer;
        }
        printArray(arrayInt1);

        System.out.println("\n2. Вывод произведения элементов массива");
        arrayInt1 = new int[10];
        length = arrayInt1.length;
        for (int i = 0; i < length; i++)
            arrayInt1[i] = i;

        // Перемножить элементы массива
        int prodDigits = 1;
        int counter = 0;
        for (int i = 1; i < 9; i++) {
            prodDigits *= (arrayInt1[i] != 0 && arrayInt1[i] != 9) ? arrayInt1[i] : 1;
            System.out.printf("%d ", arrayInt1[i]);
            counter++;
            if (counter < length - 2)
                System.out.print("* ");
        }
        System.out.printf("= %d%n", prodDigits);
        System.out.printf("Индекс %d: %d\n", 0, findIndex(arrayInt1, 0));
        System.out.printf("Индекс %d: %d\n", 9, findIndex(arrayInt1, 9));

        System.out.println("\n3. Удаление элементов массива");
        double[] arrayDouble = new double[15];
        length = arrayDouble.length;
        for (int i = 0; i < length; i++)
            arrayDouble[i] = Math.random();

        // Определить значение среднего элемента
        int middleIndex = length / 2;
        double middleNum = arrayDouble[middleIndex];

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printFormattedArray(arrayDouble);

        // Перезаписать значения
        counter = 0;
        for (int i = 0; i < length; i++) {
            if (arrayDouble[i] > middleNum) {
                arrayDouble[i] = 0;
                counter++;
            }
        }

        System.out.println("Обновлённый массив:");
        printFormattedArray(arrayDouble);
        System.out.println("\nКоличество обнулённых ячеек: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++)
            alphabet[i] = (char) ('A' + i);

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(alphabet[(length - j - 1)]);
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[40];
        length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            int index;
            int newNumber;
            do {
                newNumber = (int) (Math.random() * 40) + 60;
                index = findIndex(uniqueNumbers, newNumber);
            } while (index >= 0);
            uniqueNumbers[i] = newNumber;
        }

        Arrays.sort(uniqueNumbers);
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", uniqueNumbers[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] filteredArray = new String[getNonEmptyElementCount(srcArray)];

        int indexBegin = -1;
        int indexNewArrayEnd = 0;
        length = srcArray.length;
        for (int i = 0; i < length; i++) {
            // Подготавливаем текущий элемент
            String currentStringElement = srcArray[i].replaceAll("\\s", "");
            if (currentStringElement.equals("")) {
                // Определить конец копируемой последовательности
                if (indexBegin != -1) {
                    int copyLength = (i - indexBegin);
                    System.arraycopy(srcArray, indexBegin, filteredArray, indexNewArrayEnd, copyLength);
                    indexNewArrayEnd += copyLength;
                    indexBegin = -1;
                }
                // Определить индекс начала копируемой последовательности
            } else if (indexBegin == -1)
                indexBegin = i;
        }
        printArray(srcArray);
        printArray(filteredArray);
    }

    private static void printFormattedArray(double[] printedArray) {
        int middleIndex = printedArray.length / 2;
        for (int i = 0; i < printedArray.length; i++) {
            System.out.printf("%.3f ", printedArray[i]);

            // Перенос на новую строку
            if ((i + 1) % (middleIndex + 1) == 0)
                System.out.println();
        }
        System.out.println();
    }

    // Вывод целочисленного массива
    private static void printArray(int[] printedArray) {
        for (int i : printedArray)
            System.out.printf("%d ", i);
        System.out.println();
    }

    // Вывод строкового массива
    private static void printArray(String[] printedArray) {
        int index = 0;
        for (String s : printedArray) {
            System.out.printf("\"%s\"", s);
            index++;
            if (index != printedArray.length)
                System.out.print(", ");
        }
        System.out.println();
    }

    // Поиск в массиве
    private static int findIndex(int[] searchedArray, int find) {
        for (int i = 0; i < searchedArray.length; i++) {
            if (searchedArray[i] == find)
                return i;
        }
        return -1;
    }

    private static int getNonEmptyElementCount(String[] arrayString) {
        int count = 0;
        for (String element : arrayString) {
            if (!element.replaceAll("\\s", "").equals(""))
                count++;
        }
        return count;
    }
}