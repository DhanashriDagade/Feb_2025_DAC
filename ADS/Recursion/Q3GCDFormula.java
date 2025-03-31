import java.util.Scanner;

public class Q3GCDFormula {
    public static String generateGCDFormula(int n) {
        if (n == 2) {
            return "gcd(int, int)"; 
        }
        return "gcd(int, " + generateGCDFormula(n - 1) + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n < 2) {
            System.out.println("GCD formula requires at least two numbers.");
        } else {
            System.out.println("Output: " + generateGCDFormula(n));
        }
    }
}
