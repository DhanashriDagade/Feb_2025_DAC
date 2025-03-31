import java.util.Scanner;

public class Q2MultiplicationTable {
    public static void printTable(int num, int m) {
        if (m > 10) return; 
        
        System.out.println(num + " * " + m + " = " + (num * m));
        
        printTable(num, m + 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        sc.close();
        
        System.out.println("Multiplication Table of " + N + ":");
        printTable(N, 1); 
    }
}
