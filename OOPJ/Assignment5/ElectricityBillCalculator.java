import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
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

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Units Consumed: ");
            double units = scanner.nextDouble();

            ElectricityBill bill = new ElectricityBill(name, units);
            bill.calculateBillAmount();
            bill.displayBill();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for units consumed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*
S F:\CDAC_FEB2025\OOPJ\Assignment5> javac ElectricityBillCalculator.java
PS F:\CDAC_FEB2025\OOPJ\Assignment5> java ElectricityBillCalculator
Enter Customer Name: abc
Enter Units Consumed: 7

Electricity Bill
-------------------------
Customer Name   : abc
Units Consumed  : 7.0
Bill Amount (Rs): 35.00
PS F:\CDAC_FEB2025\OOPJ\Assignment5> java ElectricityBillCalculator
Enter Customer Name: xyz
Enter Units Consumed: 5

Electricity Bill
-------------------------
Customer Name   : xyz
Units Consumed  : 5.0
Bill Amount (Rs): 25.00
PS F:\CDAC_FEB2025\OOPJ\Assignment5>*/