import java.util.Scanner;

public class AbsoluteValue1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + absValue);
        
        scanner.close();
    }
}
/*output
Enter a number: 45
Absolute value: 45
*/