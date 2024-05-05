import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Hours should be between 0 and 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Minutes should be between 0 and 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Seconds should be between 0 and 60");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void inputTimeFromUser() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();
            scanner.close();

            setTime(hours, minutes, seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}

public class program4 {
    public static void main(String[] args) {
        Time time = new Time();
        time.inputTimeFromUser();
        time.displayTime();
    }
}
