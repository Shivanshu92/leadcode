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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode a = head;
        ListNode b = head2;
        while(b!=null){
            if(a.val!=b.val){
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode frw = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            frw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frw; 
        }
        return prev;
    }
}