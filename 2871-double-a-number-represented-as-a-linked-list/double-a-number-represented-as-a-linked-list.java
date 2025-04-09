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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode curr = reverse(head);
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
         int c = 0;
        while(curr != null){
            int totalVal = curr.val*2 + c;
            temp.next = new ListNode(totalVal % 10);
            temp = temp.next;
            curr = curr.next;
            c = totalVal/10;
            
        }
        while(c != 0){
            temp.next = new ListNode(c%10);
            c = c/10;
        }
         return reverse(ans.next);
    }
}