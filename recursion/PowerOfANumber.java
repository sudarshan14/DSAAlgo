class PowerOfANumber{

public static void main(String[] args){

int base = 2;
int exp = 0;

int mul = powerOfANumber(base,exp);

System.out.println(mul);
   

}

static int powerOfANumber(int base, int exp){

    if( exp ==0 ){
        return 1;
    }
    return base * powerOfANumber(base, exp-1);

}

}