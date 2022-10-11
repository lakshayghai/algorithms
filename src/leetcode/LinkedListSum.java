package leetcode;

public class LinkedListSum {

    public static void main(String[] args) {
        ListNode l1one = new ListNode(9);
        ListNode l1two = new ListNode(9);
        ListNode l1three = new ListNode(9);
        ListNode l2one = new ListNode(9);
        ListNode l2two = new ListNode(9);
        ListNode l2three = new ListNode(9);
        ListNode l2four = new ListNode(9);
        l1one.next = l1two;
        l1two.next = l1three;
        l2one.next = l2two;
        l2two.next = l2three;
        l2three.next = l2four;
        addTwoNumbers(l1one, l2one);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start1 = l1;
        ListNode start2 = l2;
        ListNode answer = null;
        ListNode temp;
        ListNode end = null;
        int carry = 0;
        while (start1 !=null && start2 != null) {
            int sum = start1.val + start2.val + carry;
            carry = 0;
            if(sum >= 10) {
                temp = new ListNode(sum%10);
                carry = 1;
            } else {
                temp = new ListNode(sum);
            }
            if (answer == null) {
                answer = temp;
                end = answer;
            } else {
                end.next = temp;
                end = temp;
            }
            start1 = start1.next;
            start2 = start2.next;
        }
        while(start1 != null) {
            int sum = start1.val + carry;
            if(sum >= 10) {
                temp = new ListNode(sum%10);
                carry = 1;
            } else {
                temp = new ListNode(sum);
            }
            end.next = temp;
            end = temp;
            start1 = start1.next;
        }
        while(start2 != null) {
            int sum = start2.val + carry;
            if(sum >= 10) {
                temp = new ListNode(sum%10);
                carry = 1;
            } else {
                temp = new ListNode(sum);
            }
            end.next = temp;
            end = temp;
            start2 = start2.next;
        }
        if(carry == 1) {
            temp = new ListNode(1);
            carry = 0;
            end.next = temp;
            end = temp;
        }
        return answer;
    }
}
