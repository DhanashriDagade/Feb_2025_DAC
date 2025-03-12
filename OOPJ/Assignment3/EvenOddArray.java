import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenCount = 0, oddCount = 0;
        
        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }
        
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        
        scanner.close();
    }
}
/*
Number of students securing 40% and below: 0
PS F:\CDAC_FEB2025\OOPJ\Assignment3> javac EvenOddArray.java
PS F:\CDAC_FEB2025\OOPJ\Assignment3> java EvenOddArray
Enter 20 integer numbers:
2
3
4

5

67
8
7
6
6
5
2
9
65
45
56
78
90
60
45
43
Even numbers:
2 4 8 6 6 2 56 78 90 60
Odd numbers:
3 5 67 7 5 9 65 45 45 43*/