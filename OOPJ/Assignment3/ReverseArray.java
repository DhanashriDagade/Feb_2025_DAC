import java.util.Scanner;

class ReverseArray {
   
    void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

/*Output
Enter the size of the array: 5
Enter 5 elements:
1
2
3 
4
5
Reversed array:
5 4 3 2 1 */