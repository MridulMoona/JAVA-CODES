import java.util.Scanner;

class Rectangle {

    public double length;
    public double breadth;

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();

        scanner.close();
    }

    public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        display(area, perimeter);
    }

    public void display(double area, double perimeter) {
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class program2 {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        myRectangle.read();

        myRectangle.calculate();
    }
}
