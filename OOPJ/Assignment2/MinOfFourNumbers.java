import java.util.Scanner;

public class MinOfFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)): ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
        
        System.out.println("The minimum number is: " + min);
        
        scanner.close();
    }
}
/*output
Enter four numbers: 3
13
23
6
The minimum number is: 3 
*/