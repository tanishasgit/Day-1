//1. Write a Program to input String from user and output the reverse of the string
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

  
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
      
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            
            reversed += input.charAt(i);
        }

        return reversed;
    }
}
//3.Write a program to check whether a input String is palindrome or not!
import java.util.Scanner;

public class PalindromeCheckRecursive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean isPalindrome = isPalindromeRecursive(input);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }

    public static boolean isPalindromeRecursive(String str) {

        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindromeRecursive(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}

//4.Write a program to replace a character in a string at any specific index taken as input
import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the index (0-based): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);
        String modifiedString = replaceCharAtIndex(input, index, newChar);
        System.out.println("Modified string: " + modifiedString);

    }

    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = newChar;
        return new String(chars);
    }
}
//5.Take a String input and apply all the string methods you know! And show the output accordingly!
import java.util.Scanner;

public class StringMethodsDemo {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original string: " + input);
        int length = input.length();
        System.out.println("Length of string: " + length);
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        String lowercase = input.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        String substring = input.substring(0, 5);
        System.out.println("Substring (0, 5): " + substring);
        char charAtIndex = input.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex);
        int indexOfA = input.indexOf('a');
        System.out.println("Index of 'a': " + indexOfA);
        int lastIndexOfA = input.lastIndexOf('a');
        System.out.println("Last index of 'a': " + lastIndexOfA);
        String replaced = input.replace('a', 'e');
        System.out.println("Replace 'a' with 'e': " + replaced);

        
    }
}

