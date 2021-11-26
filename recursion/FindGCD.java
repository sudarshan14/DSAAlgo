class FindGCD{

    public static void main(String [] args){

    int a = 4;
    int b = 8;
    System.out.println(getGCD(a,b));

    }


    static int getGCD(int a, int b){
      // using EUCLID formula
        if(a == 0)
        return a;   
        if(a ==1 || b ==1)
        return 1;
       return   getGCD(a, a%b);

    }


}