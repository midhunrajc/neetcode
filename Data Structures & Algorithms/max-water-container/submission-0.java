class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int height = 0;
        int area = 0;
        int width =0;

        while (left < right) {
            height = Math.min(heights[left], heights[right]);
            width = right - left;
            area = Math.max(area, width * height);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
            
        }

        return area;
    }
}
