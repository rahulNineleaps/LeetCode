package LinkedList;
//https://leetcode.com/problems/add-two-numbers/
//To Becompleted by 15th July 2020


 //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class AddTwoNumbers {
	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode result= new ListNode();
	        int sum=0;
	        int carry=0;
	        
	      ListNode dummy=result;
	        
	        while(l1!=null || l2!=null){
	            sum=sum+carry;
	            if(l1!=null){
	                
	                sum=sum+l1.val;
	                l1=l1.next;
	            }
	            if(l2!=null){
	                sum=sum+l2.val;
	                l2=l2.next;
	            }
	            
	            carry=sum/10;
	            sum=sum%10;
	            
	            ListNode newnode= new ListNode(sum);
	            result.next=newnode;
	            result=newnode;
	            sum=0;
	            
	        }
	        if(carry!=0){
	            result.next=new ListNode(1);
	        }
	        return dummy.next;
	    }
}
