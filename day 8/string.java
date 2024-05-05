import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
    
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        System.out.println("String 2 in lowercase: " + str2.toLowerCase());
        
 
        System.out.println("Reversed string 1: " + reverseString(str1));
        System.out.println("Reversed string 2: " + reverseString(str2));
        
 
        System.out.println("Comparison of strings: " + str1.compareTo(str2));
        
        System.out.println("Inserting string 2 into string 1: " + insertString(str1, str2, 3));
     
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        System.out.println("String 2 in lowercase: " + str2.toLowerCase());
        

        int position = str1.indexOf(ch);
        if (position != -1) {
            System.out.println("Character '" + ch + "' is present in string 1 at position " + (position + 1));
        } else {
            System.out.println("Character '" + ch + "' is not present in string 1.");
        }
        
        System.out.println("String 1 is palindrome: " + isPalindrome(str1));
        System.out.println("String 2 is palindrome: " + isPalindrome(str2));
        
        int[] counts = countWordsVowelsConsonants(str1);
        System.out.println("Number of words in string 1: " + counts[0]);
        System.out.println("Number of vowels in string 1: " + counts[1]);
        System.out.println("Number of consonants in string 1: " + counts[2]);
    }
    

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
   
    public static String insertString(String base, String insert, int position) {
        StringBuilder result = new StringBuilder();
        result.append(base);
        result.insert(position, insert);
        return result.toString();
    }
    

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int[] countWordsVowelsConsonants(String str) {
        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        
        str = str.toLowerCase(); eck
        
   
        String[] words = str.split("\\s+");
        wordCount = words.length;
        
   
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        int[] counts = {wordCount, vowelCount, consonantCount};
        return counts;
    }
}
