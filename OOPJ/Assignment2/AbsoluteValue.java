import java.util.Scanner;

public class AbsoluteValue {
   
    static int absoluteValue(int num) {
        return (num ^ (num >> 31)) - (num >> 31);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int result = absoluteValue(num);
        System.out.println("Absolute value: " + result);
        
        scanner.close();
    }
}
/*output
Enter a number: 11
Absolute value: 11 
*/