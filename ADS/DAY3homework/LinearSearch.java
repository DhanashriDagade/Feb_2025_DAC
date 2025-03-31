public class LinearSearch {

    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 110;

        int result = searchElement(arr, x);
        if (result != -1) {
            System.out.println("Element x is present at index " + result);
        } else {
            System.out.println("Element x is not present in the array.");
        }
    }
}
