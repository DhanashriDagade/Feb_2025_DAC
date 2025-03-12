public class MaxProductPair {
    public static void findMaxProductPair(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        int product1 = max1 * max2;
        int product2 = min1 * min2;
        
        if (product1 > product2) {
            System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + min1 + ", " + min2 + "), Maximum Product: " + product2);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProductPair(nums);
    }
}
/*PS F:\CDAC_FEB2025\OOPJ\Assignment3> java MaxProductPair
Pair is (8, 7), Maximum Product: 56*/