package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] partsExpression;

    public void setExpression(String expression) {
        partsExpression = expression.split(" ");
    }

    public double calculate(String expression) {
        setExpression(expression);

        int num1 = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int num2 = Integer.parseInt(partsExpression[2]);

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
            default:
                System.out.println("Некорректный знак операции. Допустимые операции: +,-,*,/,^,%.");
        }
        return 0;
    }
}