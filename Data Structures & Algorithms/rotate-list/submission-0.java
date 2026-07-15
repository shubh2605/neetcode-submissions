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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode val=head;
        int size=0;
        while(val!=null){
            val=val.next;
            size++;
        }
        k=k%size;
        while(k>0){
            ListNode temp=head;
            ListNode prev=temp;
            while(temp.next.next!=null){
                
                temp=temp.next;
            }
            ListNode curr=temp.next;
            temp.next=null;
            curr.next=head;
            head=curr;
            k--;
        }
        return head;
    }
}