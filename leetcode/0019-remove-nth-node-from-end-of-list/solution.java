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
        // number of nodes
        int m = 0 ;

        if(head == null){
            return head;
        }

        while(current !=null){
            m++;
            current = current.next;
        }

        if(m == n ){
            return head.next;
        }

        int pos = m - n-1 ; // stop before the removal node
        current = head;
        int currPos = 0;
        while(currPos != pos){
            currPos++;
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}
