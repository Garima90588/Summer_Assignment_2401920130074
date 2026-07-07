class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
             return head;
        ListNode prev=null;
        ListNode curr = head;
        ListNode f=curr;
        while(f!=null)
        {
            f=curr.next;
            curr.next=prev;
            prev = curr;
            curr=f;
        }
        return prev;
        
    }
}
