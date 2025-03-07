import java.util.Scanner;
class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int a, String b, double s){
		this.id= a;
		this.name= b;
		this.salary= s;
	}
	
	void print(){
		System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
	}
}


class EmployeeDemo{
   public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.print("Enter number of employees: ");
       int n = scanner.nextInt();
       scanner.nextLine();
	   
	   Employee[] employees = new Employee[n];
	   
	    for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
			
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
			
            scanner.nextLine(); 
			
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
			
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
		
        }
		System.out.println("\nEmployee Details:");
		for (Employee emp : employees) {
			
            emp.print();
        }

        scanner.close();
	   
	   
	   
   }
}