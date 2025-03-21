public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 

        try {
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
/*Index 10 out of bounds for length 5
Program execution continues...*/