import java.util.Scanner;

public class SwapOddEvenBits {
 
    public static int swapOddEvenBits(int x) {
        int evenBits = (x & 0xAAAAAAAA) >> 1; 
        int oddBits = (x & 0x55555555) << 1;  
        return evenBits | oddBits; // Combine swapped bits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int result = swapOddEvenBits(num);
        System.out.println("Number after swapping odd and even bits: " + result);
        
        scanner.close();
    }
}
/*output
Enter a number: 10
Number after swapping odd and even bits: 5 */