import java.util.Scanner;

interface Employee {
    double earnings(double basic);

    double deductions(double basic);

    default void bonus(){};
}
class Manager implements Employee {

    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

}

class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.close();

        Substaff substaff = new Substaff();

        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}
