import java.util.*;
class CalculatorApp {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        Calculator add = new Add();
        System.out.println("Result of addition: " + add.calculate(num1, num2));
        
        Calculator sub = new Sub();
        System.out.println("Result of subtraction: " + sub.calculate(num1, num2));

        Calculator multi = new Multi();
        System.out.println("Result of multiplication: " + multi.calculate(num1, num2));

        Calculator div = new Div();
        System.out.println("Result of division: " + div.calculate(num1, num2));
    }
}

abstract class Calculator {
    abstract double calculate(double a, double b);
}

class Add extends Calculator {
    double calculate(double a, double b) {
        return a + b;
    }
}

class Sub extends Calculator {
    double calculate(double a, double b) {
        return a - b;
    }
}

class Multi extends Calculator {
    double calculate(double a, double b) {
        return a * b;
    }
}

class Div extends Calculator {
    double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

