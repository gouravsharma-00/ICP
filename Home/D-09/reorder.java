// 143. Reorder List

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
    public void reorderList(ListNode head) {

        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null, cur = slow;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;

            cur = temp;
        }

        ListNode first = head, second = pre;
        while(second.next != null) {
            ListNode temp = first.next;
            first.next = second;
            first  = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
}