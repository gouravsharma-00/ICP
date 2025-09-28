// 370. Range Addition [https://leetcode.ca/all/370.html]

/**
 * 
    Input: length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
    Output: [-2,0,3,5,3]

 */

public class App {
    public static void main(String[] args) {

        int length = 5;

        int[][] updates = {
            {1, 3, 2},
            {2, 4, 3},
            {0, 2, -2}
        };

        int[] nums = new int[length];
        int[] result = Fn(nums, updates);

        System.out.println();
        for(int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] Fn(int[] nums, int[][] updates) {
        for(int[] num : updates) {
            int start = num[0];
            int end = num[1];
            int val = num[2];

            nums[start] += val;
            
            if(end + 1 < nums.length) {
                nums[end + 1] -= val;
            }
        }

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            nums[i] += sum;
            sum = nums[i];
        }

        return nums;

    }
}