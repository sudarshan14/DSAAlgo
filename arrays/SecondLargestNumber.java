import java.util.*;
class SecondLargestNumber{

public static void main(String [] args){

int input[] = {1,2,3,5,1,2};

System.out.println(secondLargestNumber(input));

}

static int secondLargestNumber(int [] input){
  int output = -1;
  int len = input.length;
  if(len <2){
      return -1;
  }
// 1,1,2,2,2,5
  Arrays.sort(input);
System.out.println(input[len-2]);

System.out.println(len);
  for(int i = len-2; i>0 ; --i){
// System.out.println(input[i]);
        if(input[len-2] > input[i])
           return input[len-2];

  }
  
  return output;
 
}


}