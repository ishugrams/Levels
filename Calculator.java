import java.util.Scanner;

public class Calculator {

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = add(num1, num2);

        return result;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum = input();
        System.out.println("The sum is: " + sum);
    }
}
