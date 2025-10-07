// 234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        ListNode tail = head;
        if(head.next == null) {
            return true;
        }
        Stack<Integer> st = new Stack<>();
        while(tail != null) {
            st.push(tail.val);
            tail = tail.next;
        }
        ListNode temp = head;
        while(temp != null) {
            int num = st.pop();
            if(temp.val != num) {
                return false;
            }

            temp = temp.next;
        }
        return true;
        
    }
}