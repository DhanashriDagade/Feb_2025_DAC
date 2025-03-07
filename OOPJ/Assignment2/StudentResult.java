import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        int percentage = scanner.nextInt();
        
        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
/*output
Enter student percentage: 56
Result: Pass */