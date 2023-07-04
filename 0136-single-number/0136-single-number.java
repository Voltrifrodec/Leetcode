class Solution {
    public int singleNumber(int[] nums) {
        
        int match = 0;
        for(int num : nums)
            match ^= num;
        
        return match;
    }
}