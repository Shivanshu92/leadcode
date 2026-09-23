class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode t1 = dummy;
        ListNode t2 = dummy2;
        ListNode t = head;
        while(t!=null){
            if(t.val>=x){
                t2.next = t;
                t = t.next;
                t2 = t2.next;
            }
            else{
                t1.next = t;
                t = t.next;
                t1 = t1.next;
            }
        }
        t1.next = dummy2.next;
        t2.next = null;
        return dummy.next;
    }
}