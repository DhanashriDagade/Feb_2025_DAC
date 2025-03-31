public class method1 {



    static void sum1(){

        sum2();   // call

    }

    static void sum2(){

        sum1();   
       System.out.println("hello");
       System.out.println("hello");
           // call

    }

    public static void main(String[] args){

       // int a= method1.sum(3);

    }
    
}
