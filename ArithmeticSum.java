public class ArithmeticSum {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmeticSum calculator = new ArithmeticSum();

        System.out.println("Sum of 2 numbers: " + calculator.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + calculator.sum(10, 20, 30));
        System.out.println("Sum of 4 numbers: " + calculator.sum(10, 20, 30, 40));
    }
}
