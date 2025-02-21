public class OffByOneErrorForLoop {

 public static void main(String[] args) {

 for (int i = 1; i <= 9; i++) {
    System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
} 
