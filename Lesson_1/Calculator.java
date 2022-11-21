public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int a = 6;
        int b = 0;
        double result = 0;
        char sign = '%';

        if (sign == '+')
            result = a + b;
        else if (sign == '-')
            result = a - b;
        else if (sign == '*')
            result = a * b;
        else if (sign == '/') {
            if (b == 0) {
                System.out.println(a + " " + sign + " " + b + " = infinity");
                return;
            }
            result = a / (double) b;
        } else if (sign == '%'){
            if (b == 0) {
                System.out.println("Второе число не может быть 0");
                return;
            }
            result = a % b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}