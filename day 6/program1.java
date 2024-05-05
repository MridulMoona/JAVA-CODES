import java.util.Scanner;

class Plastic2D {
    double areaCost = 40;

    public double calculateCost(double area) {
        return area * areaCost;
    }
}

class Plastic3D extends Plastic2D {
    double volumeCost = 60;

    public double calculateCost(double area, double volume) {
        double cost2D = calculateCost(area);
        double cost3D = volume * volumeCost;
        return cost2D + cost3D;
    }
}

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions for 2D sheet (length width): ");
        double length2D = scanner.nextDouble();
        double width2D = scanner.nextDouble();
        double area2D = length2D * width2D;

        System.out.print("Enter the dimensions for 3D box (length width height): ");
        double length3D = scanner.nextDouble();
        double width3D = scanner.nextDouble();
        double height3D = scanner.nextDouble();
        double volume3D = length3D * width3D * height3D;

        Plastic3D plastic3D = new Plastic3D();
        double totalCost = plastic3D.calculateCost(area2D, volume3D);

        System.out.println("Total cost of plastic: Rs " + totalCost);

        scanner.close();
    }
}
