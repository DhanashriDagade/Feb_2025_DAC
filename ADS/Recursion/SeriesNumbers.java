class SeriesNumbers{
	
    static void seriesNumbers(int n){
		
		if(n<=0){
		  return  ;
		}
		else {
			seriesNumbers(n-1);
		
		}
		 System.out.print(" "+ n);
		 
			
	
	}
	
	public static void main(String[] args){
		
	
		 seriesNumbers(10);
		
		
	}
	
}
