import java.util.*;

public class FindDuplicate {
    public static List<Integer> findDuplicates(int[] arr, int n) {
        Arrays.sort(arr);
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        return duplicates.isEmpty() ? Arrays.asList(-1) : duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr, arr.length)); 
    }
}
