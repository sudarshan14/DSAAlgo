//Input an array and then print the repeating characters??
// Example:
// Input:1,3,23,11,44,3,23,2,3.
// Output:3,23
import java.util.*;
class Test1{

   
   public static void main(String[] args){
    int input[] = {1,3,23,11,44,3,23,2,3};
    int input2[] ={34,45,21,12,54,67,15};
    int input3[] ={2,7,11,15};
    int input4[] ={3,2,4};
 //   printRepeatingNumbersUsingMap(input);
   int output[] =  twoSum(input4,6);  
   System.out.print(""+output[0]+""+output[1]);
   }

   static void printRepeatingNumbersUsingSet(int[] input){
     HashSet set = new HashSet();
      for(int i=0; i<input.length ; i++){

            if( set.add(input[i])==false){
                System.out.print(input[i]);
            }         
         }
    }

    static void printRepeatingNumbersUsingMap(int [] input){


            Map<Integer, Integer> intMap = new HashMap<Integer, Integer>(); 
            for (int val : input) {
                 if (intMap.containsKey(val))
                  { 
                      intMap.put(val, intMap.get(val) + 1); 
                  } 
                  else 
                  { 
                      intMap.put(val, 1); 
                  } 
            }

           Set<Map.Entry<Integer, Integer>> intSet = intMap.entrySet(); 
        //    intSet.size();
           System.out.println("List of duplicate entires in list"+ intSet.size()); 
           for (Map.Entry<Integer, Integer> entry : intSet) {
                if (entry.getValue() > 1) {
                     System.out.println(""+entry.getKey()); 
                     } 
              }
             }


       public static int[] twoSum(int[] nums, int target) {
        int[] output =new int[2];
        //{2,7,11,15};  9
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length ; i++){
            
            int compliment = target - nums[i];
            if(map.containsKey(nums[i])){
               output[0] = map.get(nums[i]);
               output[1] = i;     
            }else{
                map.put(compliment, i);
            }
        }

    return output;
}

}  