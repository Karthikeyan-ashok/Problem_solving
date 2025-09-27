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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        int len = 0;
        ListNode node = head;
        while(node!=null)
        {
            len++;
            node = node.next;
        }
        
        ListNode tem = new ListNode(0);
        tem.next = head;
        ListNode pre = tem;
        ListNode cur = head;
        
        head=tem;
    
        while(len>=2)
        {
            ListNode temp=cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
            
            pre=cur;
            if(cur.next!=null)
            {
                cur=cur.next;
            }
            if(cur.next!=null)
            {
                temp=cur.next;
            }
            len -= 2;
        }
        return head.next;
    }
}