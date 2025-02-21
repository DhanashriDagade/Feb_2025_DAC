class SumOfDigits{
	
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  
            sum += digit;          
            num /= 10;             
        }

        System.out.println("Sum of digits: " + sum);
   }}

//OUTPUT:
//Sum of digits: 30