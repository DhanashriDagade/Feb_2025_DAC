class Student {
    private String name;
    private int marks1, marks2, marks3;

    public void setDetails(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

  
    public int totalMarks() {
        return marks1 + marks2 + marks3;
    }

    public double averageMarks() {
        return totalMarks() / 3.0;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Average Marks: " + averageMarks());
        System.out.println();
    }
}

public class Q2_StudentDemo {
    public static void main(String[] args) {
       
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setDetails("Alice", 85, 90, 88);
        student2.setDetails("Bob", 78, 80, 75);

        student1.displayDetails();
        student2.displayDetails();
    }
}
/*Student Name: Alice
Total Marks: 263
Average Marks: 87.66666666666667

Student Name: Bob
Total Marks: 233
Average Marks: 77.66666666666667*/