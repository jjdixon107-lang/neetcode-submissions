class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int columns = matrix[0].length;
        int high = (matrix.length * columns) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / columns;
            int col = mid % columns;
            int midVal = matrix[row][col];
            if (midVal == target) {
                return true;
            }
            if (midVal < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
