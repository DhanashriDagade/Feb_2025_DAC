class Sumseries{
	static int sumSeries(int n){
		if(n==0){
			return 0;
		}
		else{
			return n+ sumSeries(n-1);
		}
	
	}
	public static void main(String[] args){
		
		int n = 10;
		System.out.println(sumSeries(n));
		 
	 }
}