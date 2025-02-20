import java.util.Scanner;

 class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembership = scanner.next().toLowerCase(); 
        double discountPercentage;

       
        if (totalAmount >= 1000) {
            discountPercentage = 20;
        } else if (totalAmount >= 500) {
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }

     
        if (hasMembership.equals("yes")) {
            discountPercentage += 5;
        }

        double discountAmount = (discountPercentage / 100) * totalAmount;
        double finalAmount = totalAmount - discountAmount;

      
        System.out.println("\nTotal Purchase Amount: Rs. " + totalAmount);
        System.out.println("Discount Applied: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Payable Amount: Rs. " + finalAmount);

        scanner.close(); 
    }
}
