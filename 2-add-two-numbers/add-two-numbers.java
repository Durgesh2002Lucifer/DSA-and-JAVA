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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(l1 != null || l2 != null){
            int val1 = (l1 != null)? l1.val : 0;
            int val2 = (l2 != null)? l2.val : 0;

            int num = val1 + val2 + carry;

            int digit = num%10;
            carry = num/10;

            current.next = new ListNode(digit);
            current = current.next;
           if(l1 != null) l1 = l1.next;
           if(l2 != null) l2 = l2.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
           current =  current.next;
        }
      return dummy.next;
    }
}