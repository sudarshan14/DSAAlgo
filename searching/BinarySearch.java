class BinarySearch{

static int doBinarySearchUsingRecursion(int input[], int value, int start, int end){


    // int mid = 0;
    // int start = 0; 
    // int end = input.length-1;
    //{-15,-22,1,7,55,211,235};
    int mid = (start + end)/2;

          if(input[mid] ==value){
                return mid;
          }

         else if(input[mid] < value){
           return    doBinarySearchUsingRecursion(input,value,mid+1,end);  
         }else{
         return doBinarySearchUsingRecursion(input, value,start,mid-1);
         }
}

static int doBinarySearchUsingItereation(int input[], int value, int start, int end){
  //{1,2,3,7,55,211,235};
           System.out.println(""+value+ " start "+ start+" end"+end);
           while(start< end){
               int mid = (start +end)/2;
               if(input[mid] ==value)
               {
                    System.out.println(" mid"+mid);
                return mid;
               }
              
              else if(input[mid]< value)
              {
                   start = mid+1;
              }
              else
              {
                  end = mid-1;
              }

           }

    return -1;
}



}