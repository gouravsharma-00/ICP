// Find Peak Element - 162

class Solution {
    public int findPeakElement(int[] nums) {
       
       int max = Integer.MIN_VALUE;
       int res = 0;

       for(int i = 0; i < nums.length; i++) {
        if(max < nums[i]) {
            max = nums[i];
            res = i;
        }
       }

       return res;
    }
}