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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        // handling edge cases
        if(head == null){
            return null;
        }

        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        if( n == length ){
            ListNode newHead = head.next;
            return newHead;
        }
        int res = length - n ;
        current = head;

        while(current != null){
            res--;
            if( res == 0 ){
                break;
            }
            current = current.next;
        }

        current.next = current.next.next; 
        return head;
    }
}
