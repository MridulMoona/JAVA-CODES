import java.util.Scanner;

class string1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("\nReverse:");
        char c=' ';
        String w="";
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            w = c+w;
        }
        System.out.print("string =" +w);
       

}
};