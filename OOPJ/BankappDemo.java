class Customer{
	int id;
    String name;
    int age;
    int phoneNumber;
	
        Customer(int id, String name, int age, int phoneNumber) {
        this(id, name, age );   // Chained Constructor
		}
		Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        
       }
	void balCheck(Bank bank) {
        System.out.println("Current balance: " + bank.getBalance());
    }
}
class Bank{
	double balance;
	public Bank() {
        this(0.0);   //chained constuctor
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

}
class BankappDemo{
	public static void main (String[] args){
		
		 Customer customer = new Customer(101, "John Doe", 30);
		     Bank bank = new Bank();
			    customer.balCheck(bank);
				bank.deposit(2000);
				bank.withdraw(1500);
				customer.balCheck(bank);
			}
	
}
/*
Current balance: 0.0
Deposited: 2000.0, New balance: 2000.0
Withdrawn: 1500.0, New balance: 500.0
Current balance: 500.0*/