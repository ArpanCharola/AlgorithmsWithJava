package LinkedList;

class reverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; 
            curr.next = prev;              
            prev = curr;                   
            curr = nextTemp;               
        }
        
        return prev; 
    }
    public static void main(String[] args) {
        reverseLL rll = new reverseLL();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode reversedHead = rll.reverseList(head);
        
        // Print reversed list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}