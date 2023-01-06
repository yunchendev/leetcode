// two pointer approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        // two pointers instantiated at index 1
        // right pointer will moved scanning for unseen values
        // if found, set the left pointer to that int and move the left pointer right one
        // 0 index never needs to be modified

        int left = 1;
        
        for (int right = 1; right < nums.length; right++) {

            if(nums[right] != nums[right-1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        
        
        return left; 
    }
}