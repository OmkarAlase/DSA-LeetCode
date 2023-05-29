package com.problems;

//2. Add Two Numbers - https://leetcode.com/problems/add-two-numbers/description/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int prevCarry=0;
        ListNode head=new ListNode();
        ListNode temp=head;
        while(l1!=null && l2!=null){
            temp.next=new ListNode();
            temp=temp.next;
            int sum=l1.val+l2.val+prevCarry;
            prevCarry=sum/10;
            temp.val=sum%10;
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            temp.next=new ListNode();
            temp=temp.next;
            int sum=l1.val+prevCarry;
            prevCarry=sum/10;
            temp.val=sum%10;
            l1=l1.next;
        }
        
        while(l2!=null){
            temp.next=new ListNode();
            temp=temp.next;
            int sum=l2.val+prevCarry;
            prevCarry=sum/10;
            temp.val=sum%10;
            l2=l2.next;
        }
       
        if(prevCarry!=0){
            temp.next=new ListNode();
            temp.next.val=prevCarry;
            prevCarry=0;
        }
        return head.next;
    }
}