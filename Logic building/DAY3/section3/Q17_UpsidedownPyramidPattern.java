class UpsidedownPyramidPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            int spaces = rows - i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k < i) {
                    System.out.print(" ");
                }
            }

        
            System.out.println();
        }
    }
}
/*Output
* * * * *
 * * * *
  * * *
   * *
    *     */
