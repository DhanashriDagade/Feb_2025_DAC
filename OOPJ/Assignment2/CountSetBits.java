import java.util.Scanner;

public class CountSetBits {
   
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int result = countSetBits(num);
        System.out.println("Number of set bits: " + result);
        
        scanner.close();
    }
}
/*output
Enter a number: 30
Number of set bits: 4
*/