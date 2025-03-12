import java.util.Scanner;
class SumAndAverage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0; i<n; i++){
			arr[i]= sc.nextInt();
		}
		int sum=0;
		for(int num: arr){
			sum +=num;
			}
	 double avg= (double)sum/n;
	
	 System.out.println("Sum of all numbers: " + sum);
     System.out.println("Average of all numbers: " + avg);
	}
	
}
/*
4
Enter the elements in array:
1
2
3
4
Sum of all numbers: 10
Average of all numbers: 2.5 */
