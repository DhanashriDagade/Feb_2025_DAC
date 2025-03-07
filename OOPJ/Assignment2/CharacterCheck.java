import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        
        System.out.println("The character is: " + result);
        
        scanner.close();
    }
}
/*output
Enter a character: dhanashri
The character is: Lowercase

Enter a character: 20
The character is: Not a letter */