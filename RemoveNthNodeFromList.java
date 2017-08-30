public class RemoveNthNodeFromList {
	public static void main(String[] args) {
      ListNode n1 = new ListNode(1);  
      ListNode n2 = new ListNode(3);  
      ListNode n3 = new ListNode(5);  
      ListNode n4 = new ListNode(7);
      n1.next = n2;  
      n2.next = n3;
      n3.next = n4;
      
      RemoveNthNodeFromList removeNthNodeList = new RemoveNthNodeFromList();
  
      removeNthNodeList.removeNthListNodeFromList(n1, 2);
      printList(n1);
	}
	
	public ListNode removeNthListNodeFromList(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode p1 = pre;
		ListNode p2 = pre;
		
		int i=0;
		while (i<n) {
			p2 = p2.next;
			i++;
		}
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		p1.next = p1.next.next;
		return pre.next;
	}
	
	private static class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
	}
	
    public static void printList(ListNode head) {  
        while (head != null) {  
            System.out.print(head.val + " ");  
            head = head.next;  
        }  
        System.out.println();  
    }
	
	
}


