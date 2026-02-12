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
    public void reorderList(ListNode head) {
        ListNode current = head;
        Stack<ListNode> stack = new Stack<>();
        // handle edge cases
        if(head == null|| head.next == null){
            return ;
        }
        // traverse and push elements in stack ( last elements can be caught here )
        while(current != null){
            stack.push(current);
            current= current.next;
        }
        int n = stack.size(); // store the stack size here already...
        // reset current to head
        current = head;
        // traverse till n/2
        for(int i = 0 ; i < n/2; i++){
            ListNode last = stack.pop();
            ListNode next = current.next;
            current.next = last;
            last.next = next;

            current = next;
        }
        current.next = null;
    }
}
