class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] nums2 = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
            
        }
        
        int i = 0;
        for(int j = nums.length; j < nums2.length; j++) {
            nums2[j] = nums[i];
            i++;
        }
        
        return nums2;
    }
}