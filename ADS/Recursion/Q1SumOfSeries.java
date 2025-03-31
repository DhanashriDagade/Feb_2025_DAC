import java.util.Scanner;
public class Q1SumOfSeries {
    public static double seriesSum(int n) {
        if (n == 1) 
			return 1.0; 
        double term = 1.0 / n;
        if (n % 2 == 0) {
            return seriesSum(n - 1) - term; 
        } else {
            return seriesSum(n - 1) + term; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("Sum of the series for N = " + N + " is: " + seriesSum(N));
    }
}
