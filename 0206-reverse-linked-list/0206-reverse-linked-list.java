/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        // iterative solution
        // 3 pointers required: prev, curr, next
        // set the next node pointing to the previous node
        ListNode prev = null;
        ListNode curr = head;
        
    
        // 1 -> 2 -> 3 -> 4 -> 5
        
        // 1 <- 2 
        // 3 -> 4 -> 5
        
        // 1 <- 2 <- 3
        // 4 -> 5
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}