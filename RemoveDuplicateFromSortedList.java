
public class RemoveDuplicateFromSortedList {
	public static void main(String[] args) {
	      ListNode n1 = new ListNode(1);  
	      ListNode n2 = new ListNode(3);  
	      ListNode n3 = new ListNode(3);  
	      ListNode n4 = new ListNode(7);
	      n1.next = n2;  
	      n2.next = n3;
	      n3.next = n4;
	      RemoveDuplicateFromSortedList r = new RemoveDuplicateFromSortedList();
	      r.removeduplicate(n1);
	      printList(n1);
	}
	
	public  ListNode removeduplicate(ListNode head) {
		ListNode cur = head;
		while(cur != null) {
			while(cur.next != null && cur.val == cur.next.val) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		return head;
	}
	
	public static class ListNode {
		int val;
		ListNode  next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public  static void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
