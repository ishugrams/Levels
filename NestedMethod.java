import java.util.Scanner;

class Cuboid {

    double length, breadth, height;

    // Constructor to initialize the dimensions of the cuboid
    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the base: " + perimeter);
        return perimeter;
    }

    double calculateArea() {
        double perimeter = calculatePerimeter();
        double area = length * breadth;
        System.out.println("Area of the base: " + area);
        return area;
    }

    double calculateVolume() {
        double area = calculateArea();
        double volume = length * breadth * height;
        System.out.println("Volume of the cuboid: " + volume);
        return volume;
    }
}

public class NestedMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the cuboid: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter height of the cuboid: ");
        double height = scanner.nextDouble();

        Cuboid cuboid = new Cuboid(length, breadth, height);

        cuboid.calculateVolume();
    }
}
