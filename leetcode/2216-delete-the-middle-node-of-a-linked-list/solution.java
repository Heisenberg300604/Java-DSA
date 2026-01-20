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
        
        ListNode middle= null;
        ListNode current = head;
        ListNode prev = null;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        int mid = count/2;
        int curr = 0;
        current = head;
        while(current != null){
            if(curr == mid){
                prev.next = current.next;
                return head;
            }
            curr++;
            prev = current;
            current = current.next;
        }

        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        return middleOfLinkedList(head);
    }
}
