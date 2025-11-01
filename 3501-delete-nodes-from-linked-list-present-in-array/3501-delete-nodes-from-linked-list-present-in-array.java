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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode tem = new ListNode(0);
        ListNode cur = tem;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }

        while(head!=null)
        {
            if(!set.contains(head.val))
            {
                ListNode curr = new ListNode(head.val);
                cur.next = curr;
                cur = curr;
            }
            head = head.next;
        }
        return tem.next;
    }
}