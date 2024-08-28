import java.util.Scanner;

public class ByteSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();
        System.out.print("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        int int1 = (int) byte1;
        int int2 = (int) byte2;

        int sum = int1 + int2;

        System.out.println("The sum of the two byte values is: " + sum);
        
    }
}
