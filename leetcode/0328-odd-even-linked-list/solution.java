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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        int count = 3;
        ListNode current = head.next.next;
        ListNode oddHead = head;
        ListNode oddTail = oddHead;
        ListNode evenHead = head.next;
        ListNode evenTail = evenHead;
        // seperate odd and even and then merge them back
        while(current !=null){
            if(count%2 == 0 ){
                evenTail.next = current;
                evenTail = evenTail.next;
            }else{
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            current = current.next;
            count++;
        }
        oddTail.next = evenHead;
        evenTail.next = null;
        return oddHead;
    }
}
