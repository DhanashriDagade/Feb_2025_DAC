public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc123"; 

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
/*Caught a NumberFormatException: For input string: "abc123"
Program execution continues...*/