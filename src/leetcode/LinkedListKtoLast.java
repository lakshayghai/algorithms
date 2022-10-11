package leetcode;

public class LinkedListKtoLast {

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

        kthToLast(one, 3);
    }

    public static ListNode kthToLast(ListNode l, int k) {
        ListNode lastPointer = l;
        ListNode kthPointer = l;
        int count = 0;
        while (lastPointer.next != null && count < k) {
            lastPointer = lastPointer.next;
            count++;
        }
        while(lastPointer.next != null) {
            kthPointer = kthPointer.next;
            lastPointer = lastPointer.next;
        }
        return kthPointer;
    }

}
