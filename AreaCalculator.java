import java.util.Scanner;

public class AreaCalculator {

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double rectangleArea = calculator.calculateArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double circleArea = calculator.calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);

        System.out.println("Enter the side length of the square:");
        int side = scanner.nextInt();
        double squareArea = calculator.calculateArea(side);
        System.out.println("Area of Square: " + squareArea);

        scanner.close();
    }
}
