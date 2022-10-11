package leetcode;

import java.util.Stack;

public class LinkedListPalindrome {

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

        System.out.println(LinkedListPalindrome.isPalindrome(one));

    }

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> values = new Stack<>();
        ListNode current = head;
        while(current != null) {
            values.push(current.val);
            current = current.next;
        }
        current = head;
        while (current.next != null) {
            if (current.val != values.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public static boolean isPalindromeImproved(ListNode head) {
        Stack<Integer> values = new Stack<>();
        ListNode current = head;
        while(current != null) {
            values.push(current.val);
            current = current.next;
        }
        current = head;
        while (current.next != null) {
            if (current.val != values.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    private void reverse(ListNode node) {
        ListNode current = node;
        ListNode previous = node;
        while (current.next != null) {

        }
    }
}
