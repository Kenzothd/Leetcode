class Solution {
    public int removeDuplicates(int[] nums) {
        //unique count = 0 
        int i = 0;
        
        for(int j = 1; j < nums.length; j++) {
            //if prev != current 
            if(nums[j]  != nums[i]) {
                //add unique count by 1 and replace prev with current 
                i++;
                nums[i] = nums[j];
            }
        }
        
        //return unique count
        return i + 1;
    }
}