import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergeSortedArrays(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        int[] merged = new int[p + q];
        
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }
        
        while (i < p) {
            merged[k++] = A[i++];
        }
        while (j < q) {
            merged[k++] = B[j++];
        }
        
        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        
        mergeSortedArrays(A, B);
        
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}
/*Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/