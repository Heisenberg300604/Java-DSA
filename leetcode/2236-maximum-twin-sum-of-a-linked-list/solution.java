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
    public int pairSum(ListNode head) {
        ListNode current = head;
        int max = Integer.MIN_VALUE;
        int n = 0;
        // length of the linkedlist
        while(current !=null){
            n++;
            current = current.next;
        }
        int k = 0;
        int[] num = new int[n];
        while(head !=null){
            num[k] = head.val;
            k++;
            head = head.next;
        }
        
        int i = 0 ;
        int j = n-1;
        while(j>i){
            max = Math.max(max , num[i]+num[j]);
            j--;
            i++;
        }
        return max;
    }
}
