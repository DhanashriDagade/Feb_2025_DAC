class Logical
 {
    public static void main(String[] args) 
	{
		int num=4;
		
        if (num>0 && num%2 == 0)
		{
            System.out.println(num + " is positive and even.");
        } 
		else if (num>0 && num%2 != 0) 
		{
            System.out.println(num + " is positive but not even.");
        } 
		else if (num<0 || num == 0)
		{			
		System.out.println(num + " is not positive.");
        }

        if (!(num>0)) 
		{
            System.out.println("The number is not positive (using NOT operator).");
        }

    }
}
