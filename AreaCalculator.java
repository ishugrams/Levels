public class AreaCalculator {

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0; 
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double squareSide = 5.0;
        System.out.println("Area of square: " + calculator.calculateArea(squareSide));

        double length = 4.0;
        double width = 6.0;
        System.out.println("Area of rectangle: " + calculator.calculateArea(length, width));

        double radius = 3.0;
        System.out.println("Area of circle: " + calculator.calculateArea(radius, true));
    }
}
