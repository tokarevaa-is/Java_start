import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] arrayInt1 = {7, 4, 2, 5, 1, 3, 6};
        int[] arrayInt2 = new int[7];
        for (int i = 7; i > 0; i--) {
            arrayInt2[7 - i] = arrayInt1[i - 1];
        }
        printArray(arrayInt1);
        printArray(arrayInt2);

        System.out.println("\n1. Реверс значений массива");
        arrayInt1 = new int[10];
        for (int i = 0; i < arrayInt1.length; i++) {
            int foundedIndex;
            do {
                arrayInt1[i] = (int) (Math.random() * 10);
                foundedIndex = searchInArray(arrayInt1, arrayInt1[i]);
            } while (foundedIndex >= 0 && foundedIndex < i);
        }

        // Перемножить элементы массива
        int productOfArray = 1;
        for (int element : arrayInt1) {
            productOfArray *= (element != 0 && element != 9) ? element : 1;
        }

        arrayInt2 = new int[10];
        int counter = 0;
        for (int i = 0; i < arrayInt1.length; i++) {
            if (arrayInt1[i] != 0 && arrayInt1[i] != 9) {
                counter++;
                System.out.printf("%d ", arrayInt1[i]);
                if (counter < arrayInt1.length - 2)
                    System.out.print("* ");
            } else {
                arrayInt2[arrayInt1[i]] = i;
            }
        }
        System.out.printf("= %d%n", productOfArray);
        System.out.println("Индекс 0: " + (arrayInt2[0] + 1));
        System.out.println("Индекс 9: " + (arrayInt2[9] + 1));

        System.out.println("\n3. Удаление элементов массива");
        double[] arrayDouble = new double[15];
        for (int i = 0; i < arrayDouble.length; i++)
            arrayDouble[i] = Math.random();

        // Определить значение среднего элемента
        int middleIndex = arrayDouble.length / 2;
        double middle = arrayDouble[middleIndex];

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.printf("%.3f ", arrayDouble[i]);

            // Перенос на новую строку
            if ((i + 1) % (middleIndex + 1) == 0)
                System.out.println();
        }
        System.out.println();

        // Перезаписать значения
        counter = 0;
        System.out.println("Обновлённый массив:");
        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] > middle) {
                arrayDouble[i] = 0.0;
                System.out.printf("%5d ", (int) arrayDouble[i]);
                counter++;
            } else
                System.out.printf("%.3f ", arrayDouble[i]);

            // Перенос на новую строку
            if ((i + 1) % (middleIndex + 1) == 0)
                System.out.println();
        }

        System.out.println("\nКоличество обнулённых ячеек: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrayChar = new char[26];
        counter = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            arrayChar[counter] = (char) i;
            counter++;
        }

        for (int i = 0; i <= arrayChar.length; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(arrayChar[(arrayChar.length - j - 1)]);
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        arrayInt1 = new int[40];
        for (int i = 0; i < arrayInt1.length; i++) {
            int foundedIndex;
            do {
                arrayInt1[i] = (int) (Math.random() * 40) + 60;
                foundedIndex = searchInArray(arrayInt1, arrayInt1[i]);
            } while (foundedIndex >= 0 && foundedIndex < i);
        }

        Arrays.sort(arrayInt1);
        for (int i = 0; i < arrayInt1.length; i++) {
            System.out.printf("%d ", arrayInt1[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] arrayString = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] arrayStringCopy = new String[getNonEmptyElementCount(arrayString)];

        int indexBegin = -1;
        int indexNewArrayEnd = 0;
        for (int i = 0; i < arrayString.length; i++) {
            // Подготавливаем текущий элемент
            String currentStringElement = arrayString[i].replaceAll("\\s", "");
            if (currentStringElement.equals("")) {
                // Определить конец копируемой последовательности
                if (indexBegin != -1) {
                    int copyLength = (i - indexBegin);
                    System.arraycopy(arrayString, indexBegin, arrayStringCopy, indexNewArrayEnd, copyLength);
                    indexNewArrayEnd += copyLength;
                    indexBegin = -1;
                }
                // Определить индекс начала копируемой последовательности
            } else if (indexBegin == -1)
                indexBegin = i;
        }
        printArray(arrayString);
        printArray(arrayStringCopy);
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
    private static int searchInArray(int[] searchedArray, int find) {
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