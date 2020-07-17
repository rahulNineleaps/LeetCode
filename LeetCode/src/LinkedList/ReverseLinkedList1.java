package LinkedList;

public class ReverseLinkedList1 {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		if (head == null)
			return head;
		while (head != null) {
			// keeping a next reference
			ListNode Next = head.next;
			// reversing the links
			head.next = prev;
			// prev to current pointer
			prev = head;
			//
			head = Next;
		}
		return prev;

	}
}


/* reverse a linked list 2
 * unable to solve , though good solution available ::
 * https://leetcode.com/problems/reverse-linked-list-ii/discuss/675558/Java-Easy-Soln-or-O(n)-or-Beats-100-or-With-clear-comments.
 * 
 * 
 * */
 