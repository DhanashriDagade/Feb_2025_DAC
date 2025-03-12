import java.util.Scanner;

class StudentMarksAnalysis{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int students=20;
		int[] physics= new int[students];
		int[] chemistry= new int[students];
		int[] maths= new int[students];
		int above75=0, below40=0;
		
		 System.out.println("Enter the marks for 20 students in Physics, Chemistry, and Maths:");
         for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + " Physics: ");
            physics[i] = scanner.nextInt();
            System.out.print("Student " + (i + 1) + " Chemistry: ");
            chemistry[i] = scanner.nextInt();
            System.out.print("Student " + (i + 1) + " Maths: ");
            maths[i] = scanner.nextInt();
            
            int total = physics[i] + chemistry[i] + maths[i];
            double percentage = (total / 300.0) * 100;
            
            if (percentage >= 75) {
                above75++;
            } else if (percentage <= 40) {
                below40++;
            }
        }
        
        System.out.println("Number of students securing 75% and above: " + above75);
        System.out.println("Number of students securing 40% and below: " + below40);
        
        scanner.close();
		
		
	}
}
/*
Enter the marks for 20 students in Physics, Chemistry, and Maths:
Student 1 Physics: 56
Student 1 Chemistry: 67
Student 1 Maths: 40
Student 2 Physics: 45
Student 2 Chemistry: 67
Student 2 Maths: 45
Student 3 Physics: 45
Student 3 Chemistry: 56
Student 3 Maths: 56
Student 4 Physics: 56
Student 4 Chemistry: 56
Student 4 Maths: 56
Student 5 Physics: 56
Student 5 Chemistry: 67
Student 5 Maths: 89
Student 6 Physics: 89
Student 6 Chemistry: 78
Student 6 Maths: 67
Student 7 Physics: 56
Student 7 Chemistry: 56
Student 7 Maths: 55
Student 8 Physics: 45
Student 8 Chemistry: 43
Student 8 Maths: 87
Student 9 Physics: 67
Student 9 Chemistry: 67
Student 9 Maths: 67
Student 10 Physics: 55
Student 10 Chemistry: 45
Student 10 Maths: 34
Student 11 Physics: 67
Student 11 Chemistry: 56
Student 11 Maths: 89
Student 12 Physics: 87
Student 12 Chemistry: 65
Student 12 Maths: 54
Student 13 Physics: 43
Student 13 Chemistry: 65
Student 13 Maths: 76
Student 14 Physics: 87
Student 14 Chemistry: 97
Student 14 Maths: 69
Student 15 Physics: 59
Student 15 Chemistry: 49
Student 15 Maths: 60
Student 16 Physics: 70
Student 16 Chemistry: 60
Student 16 Maths: 5
Student 17 Physics: 60
Student 17 Chemistry: 60
Student 17 Maths: 70
Student 18 Physics: 89
Student 18 Chemistry: 79
Student 18 Maths: 67
Student 19 Physics: 57
Student 19 Chemistry: 68
Student 19 Maths: 49
Student 20 Physics: 47
Student 20 Chemistry: 48
Student 20 Maths: 46
Number of students securing 75% and above: 3
Number of students securing 40% and below: 0*/