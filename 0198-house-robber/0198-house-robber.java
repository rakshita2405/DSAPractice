class Solution {
    public int rob(int[] nums) {
         int pre2 = 0; // max loot up to house i-2
        int pre = 0;  // max loot up to house i-1
        int curr = 0; // max loot up to current house i
        for (int value : nums) {
            curr = Math.max(pre, pre2 + value);
            pre2 = pre;
            pre = curr;
        }
        return curr;
    }
}