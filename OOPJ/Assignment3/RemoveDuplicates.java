import java.util.Scanner;

class RemoveDuplicates{
	
	 public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
	
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the sorted array: ");
		int n = sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter " + n + " sorted numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		//print 
        int newLength = removeDuplicates(arr);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
		
	}
}
/*
Enter the number of elements in the sorted array: 4
Enter 4 sorted numbers:
1
1
3
4
Array after removing duplicates:
1 3 4*/