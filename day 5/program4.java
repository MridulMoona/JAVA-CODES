class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}

public class program4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultInt = calculator.subtract(10, 5);
        System.out.println("Subtraction of two integers: " + resultInt);

        double resultDouble = calculator.subtract(7.5, 3.2);
        System.out.println("Subtraction of two doubles: " + resultDouble);

        int[] numbersInt = { 20, 3, 5 };
        resultInt = calculator.subtract(numbersInt);
        System.out.println("Subtraction of an array of integers: " + resultInt);

        double[] numbersDouble = { 15.5, 2.5, 4.8 };
        resultDouble = calculator.subtract(numbersDouble);
        System.out.println("Subtraction of an array of doubles: " + resultDouble);
    }
}
