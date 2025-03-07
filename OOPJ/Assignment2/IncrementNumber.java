import java.util.Scanner;

public class IncrementNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int incrementedValue = -~num; 
        System.out.println("Incremented value: " + incrementedValue);
        
        scanner.close();
    }
}

/*output
Enter a number: 23
Incremented value: 24 
*/