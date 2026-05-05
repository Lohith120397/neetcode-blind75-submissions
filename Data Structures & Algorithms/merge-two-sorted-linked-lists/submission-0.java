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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode currentL1Node = list1;
        ListNode currentL2Node = list2;
        ListNode resultNode = null;
        ListNode currentResultNextNode = null;

        while(currentL1Node != null && currentL2Node != null) {
            if(currentL1Node.val < currentL2Node.val) {
                if(resultNode == null) {
                    currentResultNextNode = resultNode = new ListNode(currentL1Node.val, null);
                } else {
                    currentResultNextNode = currentResultNextNode.next = new ListNode(currentL1Node.val, null);
                }
                currentL1Node = currentL1Node.next;
            } else {
                if(resultNode == null) {
                    currentResultNextNode = resultNode = new ListNode(currentL2Node.val, null);
                } else {
                    currentResultNextNode = currentResultNextNode.next = new ListNode(currentL2Node.val, null);
                }
                currentL2Node = currentL2Node.next;
            }
        }

        while (currentL1Node != null){
            currentResultNextNode = currentResultNextNode.next = new ListNode(currentL1Node.val, null);
            currentL1Node = currentL1Node.next;
        }

        while (currentL2Node != null) {
            currentResultNextNode = currentResultNextNode.next = new ListNode(currentL2Node.val, null);
            currentL2Node = currentL2Node.next;
        }

        return resultNode;
    }
}