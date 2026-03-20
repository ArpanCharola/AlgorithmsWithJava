// mergeTwoLists.java - Standalone OOP Java code for VSCode
// Run with: javac mergeTwoLists.java && java MergeTwoLists
package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    // Helper to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
    
    public static void main(String[] args) {
        MergeTwoLists solution = new MergeTwoLists();
        
        // Test case 1
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged = solution.mergeTwoLists(l1, l2);
        System.out.print("Merged: ");
        ListNode.printList(merged);  // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
        
        // Test case 2: empty lists
        merged = solution.mergeTwoLists(null, null);
        System.out.print("Empty: ");
        ListNode.printList(merged);  // null
        
        // Test case 3
        l1 = null;
        l2 = new ListNode(0);
        merged = solution.mergeTwoLists(l1, l2);
        System.out.print("Single: ");
        ListNode.printList(merged);  // 0 -> null
    }
}
