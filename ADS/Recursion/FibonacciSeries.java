class FibonacciSeries {
	
	static int fibon(int n){
		if(n<=1)
		{
			return n;
		}
		else {
			return fibon(n - 1)+ fibon (n - 2);
		}
	}
	
	 public static void main(String args[])
    {
       
        int n = 10;

        for (int i = 0; i < n; i++) {

            System.out.print(fibon(i) + " ");
        }
        
    }
	
}