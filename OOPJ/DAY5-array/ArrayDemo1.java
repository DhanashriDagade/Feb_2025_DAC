class ArrayDemo1{
public static void main(String[] args){
	int a[][]= new int[3][3];
	
	//int a[][] = {{11,12,13},{14,15,16},{17,18,19}};
	
	
	a[0][0] = 11;
	a[0][1] = 12;
	a[0][2] = 13;
	a[1][0] = 14;
	a[1][1] = 15;
	a[1][2] = 16;
	a[2][0] = 17;
	a[2][1] = 18;
	a[2][2] = 19; 
	
	
	for(int[] i: a){
		for (int j: i){
	       System.out.print(j+ " ");
	     }
		  System.out.println();
	 }
   } 
  }