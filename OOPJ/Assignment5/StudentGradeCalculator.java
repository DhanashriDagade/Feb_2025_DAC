import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double[] marks;
    private double average;
    private char grade;

    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new double[5];

        for (int i = 0; i < 5; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            this.marks[i] = marks[i];
        }
    }

    public void calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        this.average = sum / 5;
    }

    public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent Information");
        System.out.println("-------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Roll No     : " + rollNo);
        System.out.print("Marks       : ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage     : " + String.format("%.2f", average));
        System.out.println("Grade       : " + grade);
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
          
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();

            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects (0 - 100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }

            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/*Enter Student Name: dhanashri dagade
Enter Roll Number: 1
Enter marks for 5 subjects (0 - 100):
Subject 1: 56
Subject 2: 40
Subject 3: 58
Subject 4: 20
Subject 5: 87

Student Information
-------------------------
Name        : dhanashri dagade
Roll No     : 1
Marks       : 56.0 40.0 58.0 20.0 87.0
Average     : 52.20
Grade       : F*/