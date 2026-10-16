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
//  ListNode dummy = new ListNode(-1);
//         ListNode dummy2 = new ListNode(-1);
//         ListNode t1 = dummy;
//         ListNode t2 = dummy2;
//         ListNode t = head;
//         while(t!=null){
//             t1.next = t;
//             t = t.next;
//             t1 = t1.next;
//             t2.next = t;
//             if(t!=null){
//                 t = t.next;
//             }
//             t2 = t2.next;
//         }
//         t1.next = dummy2.next;
//         return dummy.next;
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode t1 = dummy;
        ListNode t2 = dummy2;
        ListNode t = head;
        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t!=null){
                t = t.next;
            }
            t2 = t2.next;
        }
        t1.next = dummy2.next;
        return dummy.next;
    }
}