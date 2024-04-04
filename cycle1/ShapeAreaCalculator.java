import java.util.Scanner;

public class ShapeAreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Invalid shape specified");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculateArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        double rectangleArea = calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        double triangleArea = calculateArea(triangleBase, triangleHeight, "triangle");
        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }
}
