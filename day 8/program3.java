import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(int s){
    }
}

class program3{
    static void ProcessInput(int number)throws NegativeNumberException{
        if(number<0){
            throw new NegativeNumberException(number);
        } else
        {
            double doubleValue = number * 2.0;
      System.out.println("The double value of the entered number is: " + doubleValue);
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter the number here");
        number = scanner.nextInt();
        scanner.close();

        try {
            ProcessInput(number);
          } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
          }
    }
}