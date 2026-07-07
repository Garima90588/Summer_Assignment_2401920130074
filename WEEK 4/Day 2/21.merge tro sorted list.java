class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
           return list1;
        ListNode dummy = new ListNode(-1);
        ListNode i=list1;
        ListNode j=list2;
        ListNode curr = dummy;
        while(i!=null && j!=null)
        {
                if (i.val <= j.val) {
                curr.next = i;
                i = i.next;
            }
             else {
                curr.next = j;
                j = j.next;
            }

            curr = curr.next;
               
        }  

        
       

           

        if(i!=null)
        {
            curr.next = i;

        }
        if(j!=null)
        {
            curr.next = j;
        }
        
        return dummy.next;

        
    }
}
