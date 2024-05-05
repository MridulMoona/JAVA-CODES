public class program2 {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        int result;

        try {

            result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } finally {

            System.out.println("Finally block executed.");
        }
    }
}
