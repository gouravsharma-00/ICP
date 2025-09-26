// 

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < k; i++) {
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }

            queue.addLast(i);
        }
        int[] ans = new int[nums.length - k + 1];

        int idx = 0;

        for(int i = k; i < nums.length; i++) {

            ans[idx++] = nums[queue.peekFirst()];

            while(!queue.isEmpty() && queue.peekFirst() <= (i - k)) {
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }

            queue.addLast(i);

        }

        ans[idx++] = nums[queue.peekFirst()];

        return ans;
    }
}