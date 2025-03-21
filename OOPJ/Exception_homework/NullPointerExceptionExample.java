public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null; 

        try {
            
            
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}


/*Caught a NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
Program execution continues...*/