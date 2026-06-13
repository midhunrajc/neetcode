class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeros++;
                continue;
            }

            product *= nums[i];
        }

        if (zeros == 1) {
            for (int i = 0; i < nums.length; i++) {
                dp[i] = nums[i] == 0 ? product : 0;
            }
        } else if (zeros == 0) {
            for (int i = 0; i < nums.length; i++) {
                dp[i] = product / nums[i];
            }
        }

        return dp;


    }
}  
