class Factorial {
	public static int fact(int n){  //2
		
		if(n<=1){
			return 1;  
		}
		else{
			return n*fact(n-1);  //call recu    3  2

		}	
	}
	
	public static void main(String[] args){
		System.out.println(fact(3));
		
		
	}
}





	

// return     1

//2*1=       2;
//3*2 =6;
