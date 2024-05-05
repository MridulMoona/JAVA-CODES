class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class program5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Less than four arguments provided");
            } else {
                int sumOfSquares = 0;
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    sumOfSquares += num * num;
                }
                System.out.println("Sum of squares of all four elements: " + sumOfSquares);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer arguments.");
        }
    }
}
