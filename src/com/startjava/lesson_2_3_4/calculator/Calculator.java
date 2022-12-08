package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    String[] expressionElements;

    public void setExpression(String expression) {
        expressionElements = expression.split(" ");
    }

    public double calculate() {
        int num1 = Integer.parseInt(expressionElements[0]);
        char sign = expressionElements[1].charAt(0);
        int num2 = Integer.parseInt(expressionElements[2]);

        if (checkSign(sign)) {
            switch (sign) {
                case '+':
                    return Math.addExact(num1, num2);
                case '-':
                    return Math.addExact(num1, -num2);
                case '*':
                    return Math.multiplyExact(num1, num2);
                case '/':
                    if (num2 != 0)
                        return num1 / (double) num2;
                    else {
                        System.out.println("Второе число не может быть 0");
                        return 0;
                    }
                case '%':
                    if (num2 == 0) {
                        System.out.println("Второе число не может быть 0");
                        return 0;
                    }
                    return Math.floorMod(num1, num2);
                case '^':
                    return Math.pow(num1, num2);
            }
        }
        return 0;
    }

    // Проверить знак
    public boolean checkSign(char sign) {
        if (sign != '+' &&
                sign != '-' &&
                sign != '*' &&
                sign != '/' &&
                sign != '%' &&
                sign != '^') {

            System.out.println("Некорректный знак операции. Допустимые операции: +,-,*,/,^,%.");
            return false;
        } else
            return true;
    }
}