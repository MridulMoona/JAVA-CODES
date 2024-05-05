
interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public void getDeptDetails() {
        System.out.println("Department Details:");
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }

    public void displayHeadDetails() {
        getDetails();
        getDeptDetails();
    }

    public static void main(String[] args) {

        Head head = new Head(101, "John Doe", 201, "Engineering");

        head.displayHeadDetails();
    }
}
