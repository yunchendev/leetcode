class Solution {
    public int removeElement(int[] nums, int val) {
        
        // keep two pointers starting from index 0
        // use the right pointer to scan the array
        // if a value is found that is not the target then set left pointer to it
        // when a new value is found set it to the left pointer position
        
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {

            if(nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        
        return left; 

    }
}