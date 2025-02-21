class FibonacciNumber{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=21;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}} 

//OUTPUT:
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765