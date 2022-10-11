package leetcode;

public class LinkedListMiddle {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
