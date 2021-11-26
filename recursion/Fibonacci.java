class Fibonacci{

 
 public static void main(String[] args){
int value = 6;
int fibValue = fib(value);


 }


 static int fib(int value){
   
   if(value ==0 ){
       return 0;
   }
   if(value == 1 || value == 2){
       return 1; 
   }
   
   int fibV =  fib(value-1) + fib(value -2);
   System.out.println("Fib of " +value+" is: "+fibV);
   return fibV;

 }


}