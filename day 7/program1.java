import java.util.Scanner;

abstract class Student {

    int rollNo;
    String regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Reg No: ");
        regNo = sc.next();
        sc.close();

    }

    abstract void course();
}

class KiiTian extends Student {

    void course() {
        System.out.println("Course: Computer Science");
    }
}

public class program1 {
    public static void main(String[] args) {

        KiiTian student1 = new KiiTian();

        student1.getInput();

        System.out.println("Details:");
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Reg No: " + student1.regNo);
        student1.course();
    }
}
