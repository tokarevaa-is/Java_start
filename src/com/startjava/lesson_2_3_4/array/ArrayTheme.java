import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] arrayInt1 = {7, 4, 2, 5, 1, 3, 6};
        int length = arrayInt1.length;
        printArray(arrayInt1);
        for (int i = 0; i < (length / 2); i++) {
            int buffer = arrayInt1[i];
            arrayInt1[i] = arrayInt1[length - i - 1];
            arrayInt1[length - i - 1] = buffer;
        }
        printArray(arrayInt1);

        System.out.println("\n2. Вывод произведения элементов массива");
        arrayInt1 = new int[]{7, 8, 3, 4, 1, 9, 5, 2, 0, 6};
        length = arrayInt1.length;

        // Перемножить элементы массива
        int prodDigits = 1;
        int[] arrayInt2 = new int[10];
        int counter = 0;
        length = arrayInt1.length;
        for (int i = 0; i < length; i++) {
            prodDigits *= (arrayInt1[i] != 0 && arrayInt1[i] != 9) ? arrayInt1[i] : 1;
            if (arrayInt1[i] != 0 && arrayInt1[i] != 9) {
                System.out.printf("%d ", arrayInt1[i]);
                counter++;
                if (counter < length - 2)
                    System.out.print("* ");
            } else {
                arrayInt2[arrayInt1[i]] = i;
            }
        }
        System.out.printf("= %d%n", prodDigits);
        System.out.println("Индекс 0: " + (arrayInt2[0] + 1));
        System.out.println("Индекс 9: " + (arrayInt2[9] + 1));

        System.out.println("\n3. Удаление элементов массива");
        double[] arrayDouble = new double[15];
        length = arrayDouble.length;
        for (int i = 0; i < length; i++)
            arrayDouble[i] = Math.random();

        // Определить значение среднего элемента
        length = arrayDouble.length;
        int middleIndex = length / 2;
        double middleNum = arrayDouble[middleIndex];

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", arrayDouble[i]);

            // Перенос на новую строку
            if ((i + 1) % (middleIndex + 1) == 0)
                System.out.println();
        }
        System.out.println();

        // Перезаписать значения
        counter = 0;
        System.out.println("Обновлённый массив:");
        length = arrayDouble.length;
        for (int i = 0; i < length; i++) {
            if (arrayDouble[i] > middleNum) {
                arrayDouble[i] = 0.0;
                System.out.printf("%2.3f ", arrayDouble[i]);
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

        length = arrayChar.length;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(arrayChar[(length - j - 1)]);
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        arrayInt1 = new int[40];
        length = arrayInt1.length;
        for (int i = 0; i < length; i++) {
            int foundedIndex;
            do {
                arrayInt1[i] = (int) (Math.random() * 40) + 60;
                foundedIndex = searchInArray(arrayInt1, arrayInt1[i]);
            } while (foundedIndex >= 0 && foundedIndex < i);
        }

        Arrays.sort(arrayInt1);
        length = arrayInt1.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", arrayInt1[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] arrayString = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] arrayStringCopy = new String[getNonEmptyElementCount(arrayString)];

        int indexBegin = -1;
        int indexNewArrayEnd = 0;
        length = arrayString.length;
        for (int i = 0; i < length; i++) {
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