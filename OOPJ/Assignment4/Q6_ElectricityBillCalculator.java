import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0.0;
    }

    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBill() {
        System.out.println("\nElectricity Bill");
        System.out.println("-------------------------");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.printf("Bill Amount (Rs): %.2f\n", billAmount);
    }
}

public class Q6_ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Units Consumed: ");
        double units = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(name, units);
        bill.calculateBillAmount();
        bill.displayBill();

        scanner.close();
    }
}
/*Enter Customer Name: abc
Enter Units Consumed: 5

Electricity Bill
-------------------------
Customer Name   : abc
Units Consumed  : 5.0
Bill Amount (Rs): 25.00*/