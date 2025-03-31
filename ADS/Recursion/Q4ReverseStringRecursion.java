import java.util.Scanner;

public class Q4ReverseStringRecursion {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str; // Base case: if the string is empty, return it
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String reversed = reverseString(input);
        System.out.println("Reversed Output: " + reversed);
    }
}
