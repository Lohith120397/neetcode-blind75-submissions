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
/*
Reverse Linked List
Easy
Topics
Company Tags
Hints
Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.

Example 1:

Input: head = [0,1,2,3]

Output: [3,2,1,0]
Example 2:

Input: head = []

Output: []
Constraints:

0 <= The length of the list <= 1000.
-1000 <= Node.val <= 1000
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;

        ListNode reverseNode = null;
        
        while(head != null)
        {
            if(reverseNode == null){
                reverseNode = new ListNode(head.val, null);
            }
            else {
                reverseNode = new ListNode(head.val, reverseNode);
            }
            head = head.next;

        }
        return reverseNode;
    }
}
