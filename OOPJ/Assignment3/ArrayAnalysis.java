import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int evenCount = 0, oddCount = 0, multipleOfThreeCount = 0;
        
        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
            
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            if (numbers[i] % 3 == 0) {
                multipleOfThreeCount++;
            }
        }
        
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOfThreeCount);
        
        scanner.close();
    }
}
/*
Enter 20 integer numbers:
1
2

3
3
4
5
6
7
8
9
2
3
5
6
7
8
9
23
22
12
Number of even numbers: 9
Number of odd numbers: 11
Number of multiples of 3: 8*/