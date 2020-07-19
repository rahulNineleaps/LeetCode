package LinkedList;

public class SwapInPairs {
    public ListNode swapPairs(ListNode head) {
        //creating dummy node
    
        ListNode curr= new ListNode();
        curr.next=head;
        ListNode temp=curr;
        /* let this be the linkedlist 
         * 
         * so we need to check if curr.next and curr.next.next is not null
         * 
         * [curr|n]-->[1 |n]-->[2 |n]-->x (chain continues)
         * 
         * 
         * */
        while (curr.next!=null && curr.next.next!=null){
            ListNode first= curr.next;
            //first and second fetched , now this needs to be swapped 
            ListNode second= curr.next.next;
            
            
            first.next=second.next; //first link will point to point where chain continues 
            curr.next=second; //current points to 2nd link
            second.next=first; //second next points to original first
            curr= curr.next.next; // curr jumps twice 
            
            
        }
        return temp.next;
        
        
    }
}
