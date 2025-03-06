import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to handle both uppercase and lowercase letters
        ch = Character.toLowerCase(ch);

        // Check using the ternary operator
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                        "Vowel" : ((ch >= 'a' && ch <= 'z') ? "Consonant" : "Invalid input");

        System.out.println("The character is a: " + result);

        scanner.close();
    }
}
/*output
Enter a character: e
The character is a: Vowel */