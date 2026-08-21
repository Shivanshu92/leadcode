
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode p = null;
       ListNode c = head;
       ListNode f = null;
       while(c!=null){
           f = c.next;
           c.next = p;
           p=c;
           c=f;
       }
       return p; 
    }
}