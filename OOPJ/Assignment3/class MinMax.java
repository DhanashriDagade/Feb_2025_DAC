class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 2}; 

        int min = arr[0]; 
        int max = arr[0]; 

        for (int num : arr) {
            if (num < min) {
                min = num; // Update min if a smaller element is found
            }
            if (num > max) {
                max = num; // Update max if a larger element is found
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

/*Output
Smallest element: 2
Largest element: 20 */