
class MultiplicationOfArray{
	public static void main (String[] args){
        int a[][] = {{1, 3, 4}, {3, 4, 5}};  
        int b[][] = {{1, 3, 4}, {3, 4, 5}}; 
	    int c[][] = new int[2][3];  
	
        for (int i = 0; i < 2; i++) {  
            for (int j = 0; j < 3; j++) {  
                c[i][j] = a[i][j] * b[i][j];  
            }  
        } 
 
  System.out.println("multiplication of array is :  ");

 
  for (int[] x : c) {  
            for (int y : x) {  
                System.out.print(y + " ");  
            }  
		  System.out.println();
	 }
	}
  
}
/*PS F:\CDAC_FEB2025\OOPJ\Assignment3> java MultiplicationOfArray
multiplication of array is :  
1 9 16
9 16 25*/