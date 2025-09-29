// 74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int len = n * m - 1;
        int start = 0;
        int end = len;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int ele = matrix[mid / m][mid % m];
            if(target == ele) {
                return true;
            }else if(ele > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}