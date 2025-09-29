// 1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid[0].length;

        int ans = 0;
        for(int[] arr : grid) {
            
            int left = 0;
            int right = n - 1;

            while(left <= right) {
                int mid = left + (right - left) / 2;

                if(arr[mid] >= 0) {
                    left = mid + 1;

                }else {
                    ans += (right - mid + 1);
                    right = mid - 1;
                }
            }
        }

        return ans;
    }
}