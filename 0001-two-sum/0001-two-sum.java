class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            int num = nums[i];
            if(map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }

            map.put(complement, i);
        }

        return new int[] {};
    }
}