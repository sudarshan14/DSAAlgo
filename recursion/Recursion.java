class Recursion {


public static void main(String[] args){

   int value = 4;
   int factorial =   getFactorial(value);
System.out.println("Factorial of "+value+" :"+factorial);

}


public static int getFactorial(int value){
if(value <0){
  return -1;
}

if(value ==0 || value == 1){
    return 1;
}

   int factorial = value * getFactorial(value-1);

    return factorial;

}


}