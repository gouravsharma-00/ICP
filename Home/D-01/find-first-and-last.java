// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Find(nums, target, true);
        int last = Find(nums, target, false);
        return new int[] {first, last};
    }
    
    public int Find(int[] nums, int target, boolean flag) {
        int start = 0, end = nums.length - 1;
        int index = -1;
        while( start <= end ) {

            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                if(flag) {
                    if(mid == 0 || nums[mid - 1] < target) {
                        return mid;
                    }else {
                        end = mid - 1;
                    }
                }else {
                    if(mid == nums.length - 1 || nums[mid + 1] > target) {
                        return mid;
                    }else {
                        start = mid + 1;
                    }
                }
            }
            if(nums[mid] > target) {
                end = mid - 1;
            }else if(nums[mid] < target) {
                start = mid + 1;
            }
        }
        return index;
    }
}