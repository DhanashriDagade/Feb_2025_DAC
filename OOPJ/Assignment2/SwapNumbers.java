import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
    }
}

/*output
Enter first number: 56
Enter second number: 67
Before swapping: a = 56, b = 67
After swapping: a = 67, b = 56
 */