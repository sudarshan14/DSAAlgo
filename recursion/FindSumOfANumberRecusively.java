class FindSumOfANumberRecusively{


public static void main(String[] args){

int value = 110;
int sum = getSum(value);
System.out.println("Sum of "+value +" is "+sum);

}

static int getSum(int value){
if(value==0){
    return value;
}


  return   value%10 + getSum(value/10);         

}


}