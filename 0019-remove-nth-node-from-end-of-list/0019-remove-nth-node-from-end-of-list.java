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
        ListNode li = head;
        int sz = 0;
        while(li!=null)
        {
            sz++;
            li = li.next;
        }
        n = sz-n;
        while(n==0)
        {
            return head.next;
        }
        int i=0;
        li = head;
        ListNode tem = null;
        while(li!=null)
        {
            if(i==n)
            {
                if(li.next!=null)
                {
                    tem.next = li.next;
                }
                else
                {
                    tem.next = null;
                }
            }
            i++;
            tem = li;
            li = li.next;
        }
        return head;
    }
}