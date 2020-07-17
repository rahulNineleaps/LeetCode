package LinkedList;

public class MergeTwoSortedLinkedList {
	   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		   
		   //create a new list to add minimum value fro either of the sortel list 
	        ListNode toret= new ListNode();
	        ListNode dummy=toret;	        
	        //check if neither of the list is empty
	        while (l1!=null && l2!=null){
	            if(l1.val<=l2.val){
	                dummy.next=new ListNode(l1.val);
	                l1=l1.next;
	            }
	            else {
	                dummy.next=new ListNode(l2.val);
	                l2=l2.next;
	            }
	            dummy=dummy.next;
	         
	        }
	        
	        if(l1==null && l2!=null){
	        System.out.println("l1 is null but l2 is "+l2.val);
	            dummy.next=l2;
	        }
	        
	        else if (l2==null && l1!=null){
	            dummy.next=l1;
	        }
	        return toret.next;  
	    }
}
