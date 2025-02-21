public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        
        int result = (++i) + (j--);
        
        System.out.println("Result: " + result);
        System.out.println("Value of i after pre-increment: " + i);
        System.out.println("Value of j after post-decrement: " + j);
    }
}
