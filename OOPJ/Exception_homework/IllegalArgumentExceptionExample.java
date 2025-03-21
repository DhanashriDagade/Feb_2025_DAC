public class IllegalArgumentExceptionExample {
    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
        System.out.println("Age set to: " + age);
    }

    public static void main(String[] args) {
        try {
            setAge(25);  
            setAge(-5);  
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
/**Age set to: 25
Caught an IllegalArgumentException: Invalid age: -5. Age must be between 0 and 150.
Program execution continues.../