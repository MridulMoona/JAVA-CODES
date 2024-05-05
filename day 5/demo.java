import java.util.Scanner;

class Box {

    public double length;
    public double width;
    public double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the box:");

        System.out.print("Length: ");
        double length = scanner.nextDouble();

        System.out.print("Width: ");
        double width = scanner.nextDouble();

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        Box myBox = new Box(length, width, height);

        System.out.println("Volume of the box: " + myBox.volume());

        scanner.close();
    }
}
