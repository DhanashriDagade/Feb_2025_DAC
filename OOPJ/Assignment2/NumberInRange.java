import java.util.Scanner;

 class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Is the number in the range (20 to 50)? " + (num >= 20 && num <= 50));

        scanner.close();
    }
}
/*output
Enter a number: 23
Is the number in the range (20 to 50)? true */