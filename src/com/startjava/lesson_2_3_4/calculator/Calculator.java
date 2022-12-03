package com.startjava.lesson_2_3.calculator;

public class Calculator {

    // Проверить знак
    public boolean checkSign(char sign) {
        if (sign != '+' &&
            sign != '-' &&
            sign != '*' &&
            sign != '/' &&
            sign != '%' &&
            sign != '^' ) {

            System.out.println("Некорректный знак операции. Допустимые операции: +,-,*,/,^,%.");
            return false;
        }
        else
            return true;
    }

    // Выполнить расчет
    public double performCalculation(int a, char sign, int b) {
        double result = 0.0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / (double) b;
                else
                    System.out.println(a + " " + sign + " " + b + " = infinity");
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Второе число не может быть 0");
                    break;
                }
                result = a % b;
                break;
            case '^':
                if (b == 0)
                    result = 1;
                else {
                    result = 1;
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                }
                break;
        }
        return result;
    }
}