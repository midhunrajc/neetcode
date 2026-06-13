class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }

        for (int i = 0; i < row; i++) {
            int left = 0, right = matrix[0].length - 1;

            while (left < right) {
                int swap = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = swap;
                left++;
                right--;
            }
        }
    }
}
