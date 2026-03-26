# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode(0)
        curr = dummy
        carry = 0
        
        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            total = val1 + val2 + carry
            carry = total // 10
            curr.next = ListNode(total % 10)
            
            curr = curr.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next
            
        return dummy.next
# Time Complexity: O(max(m, n)) where m and n are the lengths of the two linked lists.
# Space Complexity: O(max(m, n)) for the new linked list created to store the result.

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def linked_list_to_list(node):
    values = []
    while node:
        values.append(node.val)
        node = node.next
    return values


# Example usage:
# Creating linked list for number 342 (2 -> 4 -> 3) 
l1 = ListNode(2, ListNode(4, ListNode(3)))
# Creating linked list for number 465 (5 -> 6 -> 4) 
l2 = ListNode(5, ListNode(6, ListNode(4)))
solution = Solution()
result = solution.addTwoNumbers(l1, l2)
print(linked_list_to_list(result))
