class SearchMain{

    public static void main(String[] args){

             int input[] = {1,2,3,7,55,211,235};
             int value = 211;
             int start =0;
             int end = input.length-1;
    // int sortedArr[] = SelectionSort.selectionSort(input);
   int index = BinarySearch.doBinarySearchUsingItereation(input,value,start,end);

    //  System.out.println("outpur");
        System.out.println(""+value+ " is at index "+ index);
    


    }


}