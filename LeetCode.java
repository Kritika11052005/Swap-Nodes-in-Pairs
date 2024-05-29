public class LeetCode {
    
//Definition for singly-linked list.
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//Solution starts from here----->
class Solution {
    public ListNode swapPairs(ListNode head) {// function swapPairs with return type of a node and input parameter as head of the linked list.
        ListNode original_pointer = new ListNode(0);// A dummy node is formed with value 0.
        original_pointer.next = head;// The dummy node is placed before the head.
        ListNode pointer = original_pointer;// Another pointer is created and initialized with the original pointer.
        while (pointer.next != null && pointer.next.next != null) {// both test cases are satisfied
            ListNode n1 = pointer.next;// first node to swap
            ListNode n2 = pointer.next.next;// second node to swap
            n1.next = n2.next;// the next node to the first node is the third node
            n2.next = n1;// the next node to the second node is the first node
            pointer.next = n2;// next node to the pointer is the second node
            pointer = n1;// The place of the pointer is updated to the place of the first node
        }
        return original_pointer.next;// Return the head of the list using the next node to the dummy node.
    }
}
}
