//Given an integer N. The task is to find the Nth prime number.
class NthPrimeNumber{


   public static void main(String [] args){
     int input = 5;

     System.out.println(returnPrimeNumber(input));
        String smallest = "";
        String largest = "";
        
     smallest = s.substring(0,k);

    for(int i=0;i<s.length()-k+1;i++){
        if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
        if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
        }

   }

   public static int returnPrimeNumber(int input){
 // how to calulate prime number 
  if(input)

        return input;
   }


}