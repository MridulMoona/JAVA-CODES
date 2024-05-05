import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDetails of students:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }

        Student lowestCGPAStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCGPAStudent.cgpa) {
                lowestCGPAStudent = students[i];
            }
        }

        System.out.println("\nStudent with the lowest CGPA:");
        System.out.println("Roll: " + lowestCGPAStudent.roll + ", Name: " + lowestCGPAStudent.name + ", CGPA: "
                + lowestCGPAStudent.cgpa);

        scanner.close();
    }
}
