class InsertionSort{


static int [] insertionSort(int [] input){
//{211,235,-15,7,55,1,-22};



    for(int i= 1; i< input.length; i++){
         
        int temp = input[i];
        int sortedArrayIndex = i-1;
         while(sortedArrayIndex>=0 && input[sortedArrayIndex]>temp){
         
                    input[sortedArrayIndex+1] = input[sortedArrayIndex];
                    sortedArrayIndex--;
                    }
                 input[sortedArrayIndex+1] = temp;   

    }
        return input;

}

}