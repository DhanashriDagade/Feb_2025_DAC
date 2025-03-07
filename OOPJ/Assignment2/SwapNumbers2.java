import java.util.Scanner;

 class SwapNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b; 
        a = a - b;

        System.out.println("After swapping: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        scanner.close();
    }
}
/*output
Enter first number: 45
Enter second number: 67
After swapping:
First number: 67
Second number: 45 */