
interface Motor {
    int capacity = 5;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
}

public class program2 {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();

        System.out.println("Motor Capacity: " + Motor.capacity);

        washingMachine.run();
        washingMachine.consume();
    }
}
