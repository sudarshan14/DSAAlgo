class SortingMain {

    public static void main(String[] args){

    int input[] = {211,235,-15,7,55,1,-22};
    // int sortedArr[] = SelectionSort.selectionSort(input);
    int sortedArr[] = InsertionSort.insertionSort(input);

    for(int i = 0; i< sortedArr.length; i++){
        System.out.println(sortedArr[i]);
        }
    }
}