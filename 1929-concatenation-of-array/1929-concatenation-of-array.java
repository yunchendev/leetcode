class Solution {
    public int[] getConcatenation(int[] nums) {
        
        // create an array with double the length of the input array
        // copy the elements from 0 to len and at (0 + len) to the end of result array
        // this results in nums array being copied twice
        
        int len = nums.length;
        int[] result = new int[len * 2];
        
        for(int i = 0; i < len; i++) {
            result[i] = result[i + len] = nums[i];
        }
        return result;
    }
}