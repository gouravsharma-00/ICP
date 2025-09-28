// 997. Find the Town Judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] nums = new int[n + 1];

        for(int[] t : trust) {
            int a = t[0];
            int b = t[1];

            nums[a]--;
            nums[b]++;
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums.length - 2) {
                return i;
            }
        } 

        return -1;
    }
}