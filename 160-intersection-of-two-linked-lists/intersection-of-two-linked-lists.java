public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        int l1=0;
        while(a!=null){
            a = a.next;
            l1++;
        }
        ListNode b = headB;
        int l2=0;
        while(b!=null){
            b = b.next;
            l2++;
        }
        ListNode temp = headA;
        ListNode temp2 = headB;  
        if(l1>l2){
            for(int i=1;i<=l1-l2;i++){
                temp = temp.next;
            }
        }
        else{
            for(int i=0;i<l2-l1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp!=temp2){
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    }
}