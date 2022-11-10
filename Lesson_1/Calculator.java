public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        double result = 0;
        char sign = '%';

        if (sign == '+')
            result = a + b;
        else if (sign == '-')
            result = a - b;
        else if (sign == '*')
            result = a * b;
        else if (sign == '/')
            if (b != 0)
                result = a / (double)b;
            else {
                System.out.println(a + " " + sign + " " + b + " = infinity");
                return;
            }
        else if (sign == '%')
            result = a % b;
        else if (sign == '^'){
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println("Калькулятор");
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}