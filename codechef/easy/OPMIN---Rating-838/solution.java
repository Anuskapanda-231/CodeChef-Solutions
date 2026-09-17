class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        int min = Integer.MAX_VALUE ;
            for( int i=0;i<nums.length;i++){
               if(nums[i]< min){
                   min = nums[i];
               } 
               
            }
            int count =0;
            for( int i=0;i<nums.length;i++){
               if(nums[i]==min){
                   count++; 
               } 
               
            }
            
            return nums.length-count ;
    }
}
