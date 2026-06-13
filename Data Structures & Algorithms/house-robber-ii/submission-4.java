class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] p1 = new int[nums.length - 1];
        
        for (int i = 0; i < nums.length - 1; i++) {
            p1[i] = nums[i];
        }

        int[] p2 = new int[nums.length - 1];

        for (int j = 0; j < nums.length - 1; j++) {
            p2[j] = nums[j+1];
        }

        int p1_sum = 0;
        int[] dp1 = new int[p1.length];
        dp1[0] = p1[0];
        dp1[1] = Math.max(p1[0], p1[1]);

        for (int i = 2; i < p1.length; i++) {
            dp1[i] = Math.max(dp1[i-1], p1[i] + dp1[i-2]);
        }

        int p2_sum = 0;
        int[] dp2 = new int[p2.length];
        dp2[0] = p2[0];
        dp2[1] = Math.max(p2[0], p2[1]);

        for (int j = 2; j < p2.length; j++) {
            dp2[j] = Math.max(p2[j] + dp2[j-2], dp2[j-1]);
        }

        return Math.max(dp1[p1.length -1], dp2[p2.length - 1]);


    }
}
