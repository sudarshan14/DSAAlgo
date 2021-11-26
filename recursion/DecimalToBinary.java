class DecimalToBinary{


public static void main(String [] args){
System.out.println(dtb(11));

}


static int dtb(int value){
   if(value ==0)
     return 0;

    return value%2 + 10*dtb(value/2);

}

}