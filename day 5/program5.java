import java.util.Scanner;

class ShapeAreaCalculator {

    public double area(double radius) {
        double circleArea = 3.14 * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + circleArea);
    return circleArea;
    }

    public void area(double base, double height) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle with base " + base + " and height " + height + " is: " + triangleArea);
    }

    public void area(int sideLength) {
        int squareArea = sideLength * sideLength;
        System.out.println("Area of the square with side length " + sideLength + " is: " + squareArea);

    }
}

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                calculator.area(radius);
                break;
            case 2:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                calculator.area(base, height);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                int sideLength = scanner.nextInt();
                calculator.area(sideLength);
                break;
            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
        }

    }
}
