import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    public void disp() {
        super.disp();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class program4 {
    public static void main(String[] args) {
        Person[] per= new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            per[i] = new Person();
            per[i].input();
            per[i].disp();
            System.out.println();
        }
    }
}
