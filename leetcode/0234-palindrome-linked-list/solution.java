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
    public ListNode middleOfLinkedList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        // find mid of linkedlist
        ListNode mid = middleOfLinkedList(head);
        // reverse the mid
        ListNode second = reverseLinkedList(mid);
        // compare
        ListNode current = head;
        while(second !=null){
            if(current.val != second.val){
                return false;
            }
            current = current.next;
            second = second.next;
        }
        return true;
    }
}
