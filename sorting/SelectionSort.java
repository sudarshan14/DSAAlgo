class SelectionSort{

    
    static int[] selectionSort(int [] input){

// we check for the largest value and traverse array for bigger value,
// and place largest value at the last index and reduce the array index by 1
   
   
     for(int lastUnsortedIndex = input.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){ 
          int largest = 0;
          for(int j =1; j<= lastUnsortedIndex; j++){
              if(input[j] > input[largest]){
                  largest = j;
              }
          }
                    int temp = input[lastUnsortedIndex];
                    input[lastUnsortedIndex] = input[largest];
                    input[largest] = temp;

          }

return input;
    }

}