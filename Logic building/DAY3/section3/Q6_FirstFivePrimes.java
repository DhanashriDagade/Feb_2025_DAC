public class FirstFivePrimes {
    public static void main(String[] args) {
        System.out.print("First 5 prime numbers: ");
        int count = 0, num = 2;  

        while (count < 5) {
            if (isPrime(num)) {  
                System.out.print(num + " ");
                count++;  
            }
            num++;  
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {  
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {  
                return false;
            }
        }
        return true;  // Otherwise, it's prime
    }
}

//OUTPUT:
//First 5 prime numbers: 2 3 5 7 11
