import java.util.Scanner;

class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num % 10;  
            num /= 10;  
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}

/* output:
 Enter a number: 23
Sum of digits: 5 */


