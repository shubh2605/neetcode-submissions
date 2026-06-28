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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null && head.next==null)return head;
        ListNode temp=head;
        while(temp.next!=null){
            int val1=temp.val;
            int val2=temp.next.val;
            int min=Math.min(val1,val2);
            while(min>=1 ){
                if(val1%min==0 && val2%min==0)break;
                min--;
            }
            ListNode dummy=new ListNode(min);
            ListNode next=temp.next;
            temp.next=dummy;
            dummy.next=next;

            temp=temp.next.next;
        }
        return head;
    }
}