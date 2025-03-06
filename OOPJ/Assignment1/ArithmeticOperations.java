import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int add = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int devisi = num1 / num2;
		int mod = num1 % num2;
		
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
		System.out.println("Division : " + devisi);
		System.out.println("Modules : " + mod);
        
        
        scanner.close();
    }
}
