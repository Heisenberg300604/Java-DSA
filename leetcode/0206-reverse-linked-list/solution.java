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
        ListNode current = head;
        ListNode prev = null;
        ListNode temp = null;

        while(current !=null){
            temp = current.next; // save next node
            current.next = prev; //point link to previous ( aka reverse )
            prev = current; // previous ko aage badhao 
            current = temp; // move current forward
        }

        return prev;

    }
}
