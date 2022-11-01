class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int count = 0;
        HashSet<Character> hash_set = new HashSet();
        
        while(j < s.length()) {
            if(!hash_set.contains(s.charAt(j))) {
                hash_set.add(s.charAt(j));
                j++;
                count = Math.max(hash_set.size(), count);
            } else {
                hash_set.remove(s.charAt(i));
                i++;
            }
        }         
        return count;        
    }
}