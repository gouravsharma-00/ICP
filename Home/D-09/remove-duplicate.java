// 83. Remove Duplicates from Sorted List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode index = head;
        ListNode point = null;
        while(index != null) {
            if(set.contains(index.val)) {
                point.next = index.next;
                
            }else{
                set.add(index.val);
                if(point == null) {
                    point = index;
                }else {
                    point = point.next;
                }
            }
            index = index.next;
        }
        return head;
    }
}