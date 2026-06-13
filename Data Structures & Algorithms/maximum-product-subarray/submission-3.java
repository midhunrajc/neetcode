class Solution {
    public int maxProduct(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];

        max[0] = nums[0];
        min[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            max[i] = Math.max(num, Math.max(num * max[i-1], num * min[i-1]));
            min[i] = Math.min(num, Math.min(num * max[i-1], num * min[i-1]));
             result = Math.max(result, max[i]);
        }
        return result;
    }
}
