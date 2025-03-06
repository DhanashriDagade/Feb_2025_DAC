
class PositiveEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
            if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("The number is positive but not even.");
        } else {
            System.out.println("The number is not positive.");
        }
        
        scanner.close();
    }
}